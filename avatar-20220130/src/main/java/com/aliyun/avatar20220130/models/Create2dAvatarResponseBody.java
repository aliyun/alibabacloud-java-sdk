// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Create2dAvatarResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Create2dAvatarResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static Create2dAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Create2dAvatarResponseBody self = new Create2dAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public Create2dAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Create2dAvatarResponseBody setData(Create2dAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Create2dAvatarResponseBodyData getData() {
        return this.data;
    }

    public Create2dAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Create2dAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Create2dAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Create2dAvatarResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static Create2dAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Create2dAvatarResponseBodyData self = new Create2dAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Create2dAvatarResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
