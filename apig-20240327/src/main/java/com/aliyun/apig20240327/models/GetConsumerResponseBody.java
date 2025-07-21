// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetConsumerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>880C61B3-7B90-5570-A3F7-D6D92C0E2D36</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerResponseBody self = new GetConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerResponseBody setData(GetConsumerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConsumerResponseBodyData extends TeaModel {
        @NameInMap("akSkIdentityConfigs")
        public AkSkIdentityConfig akSkIdentityConfigs;

        @NameInMap("apiKeyIdentityConfig")
        public ApiKeyIdentityConfig apiKeyIdentityConfig;

        /**
         * <strong>example:</strong>
         * <p>cs-cvgbtk6m1hkji5sb8dr0</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("jwtIdentityConfig")
        public JwtIdentityConfig jwtIdentityConfig;

        /**
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerResponseBodyData self = new GetConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerResponseBodyData setAkSkIdentityConfigs(AkSkIdentityConfig akSkIdentityConfigs) {
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }
        public AkSkIdentityConfig getAkSkIdentityConfigs() {
            return this.akSkIdentityConfigs;
        }

        public GetConsumerResponseBodyData setApiKeyIdentityConfig(ApiKeyIdentityConfig apiKeyIdentityConfig) {
            this.apiKeyIdentityConfig = apiKeyIdentityConfig;
            return this;
        }
        public ApiKeyIdentityConfig getApiKeyIdentityConfig() {
            return this.apiKeyIdentityConfig;
        }

        public GetConsumerResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetConsumerResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetConsumerResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetConsumerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConsumerResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetConsumerResponseBodyData setJwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
            this.jwtIdentityConfig = jwtIdentityConfig;
            return this;
        }
        public JwtIdentityConfig getJwtIdentityConfig() {
            return this.jwtIdentityConfig;
        }

        public GetConsumerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetConsumerResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
