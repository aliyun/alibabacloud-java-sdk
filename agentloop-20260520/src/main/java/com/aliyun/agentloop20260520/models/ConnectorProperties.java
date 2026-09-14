// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ConnectorProperties extends TeaModel {
    /**
     * <p>The channel type: custom or apig. This parameter is optional for model_service and defaults to custom.</p>
     */
    @NameInMap("channelType")
    public String channelType;

    /**
     * <p>The sample request body provided by the user for verifying endpoint connectivity. This parameter is required when dryRun is set to All and type is set to agent_app. The value is not persisted.</p>
     */
    @NameInMap("dryRunRequestBody")
    public String dryRunRequestBody;

    /**
     * <p>The number of retries after a failed invocation of the dial-test registration service. Valid values: 0 to 10. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxRetries")
    public String maxRetries;

    /**
     * <p>The list of supported models in comma-separated format. This parameter is required for model_service.</p>
     */
    @NameInMap("modelList")
    public String modelList;

    /**
     * <p>The network type: internet or aliyun-vpc.</p>
     */
    @NameInMap("network")
    public String network;

    /**
     * <p>The protocol type: openai, openai-compatible, or anthropic. This parameter is required for model_service.</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The QPS limit for the dial-test registration service. A value of 0 indicates no throttling. Otherwise, valid values: 0.1 to 1000. Default value: 20 for agent_app, 100 for model_service.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("qpsLimit")
    public String qpsLimit;

    /**
     * <p>The region. This parameter is required when the network type is aliyun-vpc.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The JSON Path extraction path for the response body. This parameter is optional for agent_app.</p>
     */
    @NameInMap("responseBodyPath")
    public String responseBodyPath;

    /**
     * <p>The security group ID. This parameter is optional for agent_app.</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The timeout for a single call, in milliseconds. Valid values: 1000 to 1800000. Default value: 300000.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("timeoutMs")
    public String timeoutMs;

    /**
     * <p>The vSwitch ID. This parameter is optional for agent_app.</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID. This parameter is optional for agent_app.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ConnectorProperties build(java.util.Map<String, ?> map) throws Exception {
        ConnectorProperties self = new ConnectorProperties();
        return TeaModel.build(map, self);
    }

    public ConnectorProperties setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ConnectorProperties setDryRunRequestBody(String dryRunRequestBody) {
        this.dryRunRequestBody = dryRunRequestBody;
        return this;
    }
    public String getDryRunRequestBody() {
        return this.dryRunRequestBody;
    }

    public ConnectorProperties setMaxRetries(String maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
    public String getMaxRetries() {
        return this.maxRetries;
    }

    public ConnectorProperties setModelList(String modelList) {
        this.modelList = modelList;
        return this;
    }
    public String getModelList() {
        return this.modelList;
    }

    public ConnectorProperties setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ConnectorProperties setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ConnectorProperties setQpsLimit(String qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }
    public String getQpsLimit() {
        return this.qpsLimit;
    }

    public ConnectorProperties setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ConnectorProperties setResponseBodyPath(String responseBodyPath) {
        this.responseBodyPath = responseBodyPath;
        return this;
    }
    public String getResponseBodyPath() {
        return this.responseBodyPath;
    }

    public ConnectorProperties setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ConnectorProperties setTimeoutMs(String timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }
    public String getTimeoutMs() {
        return this.timeoutMs;
    }

    public ConnectorProperties setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ConnectorProperties setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
