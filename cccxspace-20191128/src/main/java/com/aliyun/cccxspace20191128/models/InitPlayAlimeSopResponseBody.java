// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class InitPlayAlimeSopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitPlayAlimeSopResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InitPlayAlimeSopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitPlayAlimeSopResponseBody self = new InitPlayAlimeSopResponseBody();
        return TeaModel.build(map, self);
    }

    public InitPlayAlimeSopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitPlayAlimeSopResponseBody setData(InitPlayAlimeSopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitPlayAlimeSopResponseBodyData getData() {
        return this.data;
    }

    public InitPlayAlimeSopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitPlayAlimeSopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitPlayAlimeSopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitPlayAlimeSopResponseBodyData extends TeaModel {
        // 请求的uuid
        @NameInMap("Uuid")
        public String uuid;

        public static InitPlayAlimeSopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopResponseBodyData self = new InitPlayAlimeSopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
