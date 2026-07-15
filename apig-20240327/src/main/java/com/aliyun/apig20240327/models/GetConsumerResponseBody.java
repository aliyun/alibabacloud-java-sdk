// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetConsumerResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
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

    public static class GetConsumerResponseBodyDataConsumerGroups extends TeaModel {
        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>csg-8c13d2b4f8a1</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The consumer group description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于线上 API 调用方分组</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The time when the API consumer joined the consumer group. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("joinTimestamp")
        public Long joinTimestamp;

        /**
         * <p>The consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-consumer-group</p>
         */
        @NameInMap("name")
        public String name;

        public static GetConsumerResponseBodyDataConsumerGroups build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerResponseBodyDataConsumerGroups self = new GetConsumerResponseBodyDataConsumerGroups();
            return TeaModel.build(map, self);
        }

        public GetConsumerResponseBodyDataConsumerGroups setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerResponseBodyDataConsumerGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConsumerResponseBodyDataConsumerGroups setJoinTimestamp(Long joinTimestamp) {
            this.joinTimestamp = joinTimestamp;
            return this;
        }
        public Long getJoinTimestamp() {
            return this.joinTimestamp;
        }

        public GetConsumerResponseBodyDataConsumerGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetConsumerResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey identity authentication configurations.</p>
         */
        @NameInMap("akSkIdentityConfigs")
        public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

        /**
         * <p>The API key identity authentication configuration.</p>
         */
        @NameInMap("apiKeyIdentityConfig")
        public ApiKeyIdentityConfig apiKeyIdentityConfig;

        /**
         * <p>The list of consumer groups to which the API consumer belongs.</p>
         */
        @NameInMap("consumerGroups")
        public java.util.List<GetConsumerResponseBodyDataConsumerGroups> consumerGroups;

        /**
         * <p>The API consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-cvgbtk6m1hkji5sb8dr0</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The deployment status of the API in the current environment.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试专用消费者</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the API consumer is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The JWT identity authentication configuration.</p>
         */
        @NameInMap("jwtIdentityConfig")
        public JwtIdentityConfig jwtIdentityConfig;

        /**
         * <p>The API consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerResponseBodyData self = new GetConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerResponseBodyData setAkSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }
        public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
            return this.akSkIdentityConfigs;
        }

        public GetConsumerResponseBodyData setApiKeyIdentityConfig(ApiKeyIdentityConfig apiKeyIdentityConfig) {
            this.apiKeyIdentityConfig = apiKeyIdentityConfig;
            return this;
        }
        public ApiKeyIdentityConfig getApiKeyIdentityConfig() {
            return this.apiKeyIdentityConfig;
        }

        public GetConsumerResponseBodyData setConsumerGroups(java.util.List<GetConsumerResponseBodyDataConsumerGroups> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<GetConsumerResponseBodyDataConsumerGroups> getConsumerGroups() {
            return this.consumerGroups;
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
