// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The API information.</p>
     */
    @NameInMap("apiInfo")
    public HttpApiApiInfo apiInfo;

    /**
     * <p>Filters the list of operations by a specific consumer authorization rule ID. Only authorized operations are returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>car-ctgdn8em1hko5krqq03g</p>
     */
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <p>The consumer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-ctgdn2um1hkossul8gvg</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>The creation timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750852089975</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The publishing status of the API in the current environment.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("deployStatus")
    public String deployStatus;

    /**
     * <p>The environment information.</p>
     */
    @NameInMap("environmentInfo")
    public EnvironmentInfo environmentInfo;

    /**
     * <p>The expiry mode. Valid values: LongTerm and ShortTerm.</p>
     * 
     * <strong>example:</strong>
     * <p>LongTerm</p>
     */
    @NameInMap("expireMode")
    public String expireMode;

    /**
     * <p>The rule status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("expireStatus")
    public String expireStatus;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>1750852089975</p>
     */
    @NameInMap("expireTimestamp")
    public Long expireTimestamp;

    /**
     * <p>The gateway information.</p>
     */
    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53102737-1E4E-5A8B-8E0A-4184B0959B84</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The update timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750852089975</p>
     */
    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static GetConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerAuthorizationRuleResponseBody self = new GetConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerAuthorizationRuleResponseBody setApiInfo(HttpApiApiInfo apiInfo) {
        this.apiInfo = apiInfo;
        return this;
    }
    public HttpApiApiInfo getApiInfo() {
        return this.apiInfo;
    }

    public GetConsumerAuthorizationRuleResponseBody setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
        this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
        return this;
    }
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    public GetConsumerAuthorizationRuleResponseBody setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetConsumerAuthorizationRuleResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public GetConsumerAuthorizationRuleResponseBody setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public GetConsumerAuthorizationRuleResponseBody setEnvironmentInfo(EnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
        return this;
    }
    public EnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    public GetConsumerAuthorizationRuleResponseBody setExpireMode(String expireMode) {
        this.expireMode = expireMode;
        return this;
    }
    public String getExpireMode() {
        return this.expireMode;
    }

    public GetConsumerAuthorizationRuleResponseBody setExpireStatus(String expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }
    public String getExpireStatus() {
        return this.expireStatus;
    }

    public GetConsumerAuthorizationRuleResponseBody setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public GetConsumerAuthorizationRuleResponseBody setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public GetConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerAuthorizationRuleResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetConsumerAuthorizationRuleResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

}
