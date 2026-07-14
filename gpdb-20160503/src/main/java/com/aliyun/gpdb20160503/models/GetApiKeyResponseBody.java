// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sk-xxxxxxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("AuthServices")
    public java.util.List<GetApiKeyResponseBodyAuthServices> authServices;

    /**
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test api key</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>api-xxxxxxx</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p>test api key</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <strong>example:</strong>
     * <p>sk-1235*****</p>
     */
    @NameInMap("KeyPrefix")
    public String keyPrefix;

    /**
     * <strong>example:</strong>
     * <p>7565770E-7C45-462D-BA4A-8A5396****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyResponseBody self = new GetApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetApiKeyResponseBody setAuthServices(java.util.List<GetApiKeyResponseBodyAuthServices> authServices) {
        this.authServices = authServices;
        return this;
    }
    public java.util.List<GetApiKeyResponseBodyAuthServices> getAuthServices() {
        return this.authServices;
    }

    public GetApiKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetApiKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApiKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetApiKeyResponseBody setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public GetApiKeyResponseBody setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }
    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    public GetApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApiKeyResponseBodyAuthServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agdb-2ze8x9278c9iizl</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        public static GetApiKeyResponseBodyAuthServices build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyAuthServices self = new GetApiKeyResponseBodyAuthServices();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyAuthServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetApiKeyResponseBodyAuthServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
