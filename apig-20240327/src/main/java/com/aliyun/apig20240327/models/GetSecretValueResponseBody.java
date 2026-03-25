// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public GetSecretValueResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>479AE38F-A574-52F7-87EA-E91199999F9E</p>
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
        /**
         * <p>The key value.</p>
         * 
         * <strong>example:</strong>
         * <p>apikey-xxxxxxxx</p>
         */
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
