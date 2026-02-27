// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResetDataServiceAppSecretResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ResetDataServiceAppSecretResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ResetDataServiceAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDataServiceAppSecretResponseBody self = new ResetDataServiceAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDataServiceAppSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetDataServiceAppSecretResponseBody setData(ResetDataServiceAppSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetDataServiceAppSecretResponseBodyData getData() {
        return this.data;
    }

    public ResetDataServiceAppSecretResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ResetDataServiceAppSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetDataServiceAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetDataServiceAppSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetDataServiceAppSecretResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>abc123456789</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        public static ResetDataServiceAppSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetDataServiceAppSecretResponseBodyData self = new ResetDataServiceAppSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetDataServiceAppSecretResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ResetDataServiceAppSecretResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

    }

}
