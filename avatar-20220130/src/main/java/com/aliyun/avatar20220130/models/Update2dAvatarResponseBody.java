// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Update2dAvatarResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Update2dAvatarResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static Update2dAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Update2dAvatarResponseBody self = new Update2dAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public Update2dAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Update2dAvatarResponseBody setData(Update2dAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Update2dAvatarResponseBodyData getData() {
        return this.data;
    }

    public Update2dAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Update2dAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Update2dAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Update2dAvatarResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static Update2dAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Update2dAvatarResponseBodyData self = new Update2dAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Update2dAvatarResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
