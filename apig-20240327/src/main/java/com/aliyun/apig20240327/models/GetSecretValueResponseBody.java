// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetSecretValueResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueResponseBody self = new GetSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretValueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecretValueResponseBody setData(GetSecretValueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecretValueResponseBodyData getData() {
        return this.data;
    }

    public GetSecretValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretValueResponseBodyData extends TeaModel {
        @NameInMap("secretData")
        public String secretData;

        public static GetSecretValueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecretValueResponseBodyData self = new GetSecretValueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecretValueResponseBodyData setSecretData(String secretData) {
            this.secretData = secretData;
            return this;
        }
        public String getSecretData() {
            return this.secretData;
        }

    }

}
