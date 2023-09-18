// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientStartResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClientStartResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ClientStartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClientStartResponseBody self = new ClientStartResponseBody();
        return TeaModel.build(map, self);
    }

    public ClientStartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClientStartResponseBody setData(ClientStartResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClientStartResponseBodyData getData() {
        return this.data;
    }

    public ClientStartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClientStartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClientStartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClientStartResponseBodyData extends TeaModel {
        @NameInMap("ImToken")
        public String imToken;

        public static ClientStartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClientStartResponseBodyData self = new ClientStartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClientStartResponseBodyData setImToken(String imToken) {
            this.imToken = imToken;
            return this;
        }
        public String getImToken() {
            return this.imToken;
        }

    }

}
