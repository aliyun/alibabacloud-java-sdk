// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSecretResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The key information.</p>
     */
    @NameInMap("data")
    public GetSecretResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretResponseBody self = new GetSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecretResponseBody setData(GetSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecretResponseBodyData getData() {
        return this.data;
    }

    public GetSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretResponseBodyData extends TeaModel {
        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The type of the gateway. Valid values:</p>
         * <ul>
         * <li>API</li>
         * <li>AI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>The KMS configuration information.</p>
         */
        @NameInMap("kmsConfig")
        public KMSConfig kmsConfig;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysecret</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of resources that reference the current key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("referenceCount")
        public Integer referenceCount;

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>sec-d5e6shmm1hkoxxxxxxxx</p>
         */
        @NameInMap("secretId")
        public String secretId;

        /**
         * <p>The source of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        @NameInMap("secretSource")
        public String secretSource;

        /**
         * <p>The state of the key. Valid values:</p>
         * <ul>
         * <li>ENALBE</li>
         * <li>DISABLE</li>
         * <li>DELETED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENALBE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1725868548440</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecretResponseBodyData self = new GetSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecretResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetSecretResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetSecretResponseBodyData setKmsConfig(KMSConfig kmsConfig) {
            this.kmsConfig = kmsConfig;
            return this;
        }
        public KMSConfig getKmsConfig() {
            return this.kmsConfig;
        }

        public GetSecretResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecretResponseBodyData setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public GetSecretResponseBodyData setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public GetSecretResponseBodyData setSecretSource(String secretSource) {
            this.secretSource = secretSource;
            return this;
        }
        public String getSecretSource() {
            return this.secretSource;
        }

        public GetSecretResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSecretResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
