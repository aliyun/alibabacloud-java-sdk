// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSecretResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetSecretResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("gatewayType")
        public String gatewayType;

        @NameInMap("kmsConfig")
        public KMSConfig kmsConfig;

        @NameInMap("name")
        public String name;

        @NameInMap("referenceCount")
        public Integer referenceCount;

        @NameInMap("secretId")
        public String secretId;

        @NameInMap("secretSource")
        public String secretSource;

        @NameInMap("status")
        public String status;

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
