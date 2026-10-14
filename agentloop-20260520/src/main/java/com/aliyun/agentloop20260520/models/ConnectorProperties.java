// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ConnectorProperties extends TeaModel {
    /**
     * <p>The channel type. Valid values: custom and apig. This parameter is optional for model_service. Default value: custom.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("channelType")
    public String channelType;

    /**
     * <p>Specifies the sample request body provided by the user to verify endpoint connectivity. This parameter is required when dryRun is set to All and type is set to agent_app. The request body is not persisted.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;input&quot;:&quot;Hello&quot;}</p>
     */
    @NameInMap("dryRunRequestBody")
    public String dryRunRequestBody;

    /**
     * <p>The number of retry attempts after a failed service invocation when you invoke the synthetic monitoring registration service. Valid values: 0 to 10. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxRetries")
    public String maxRetries;

    /**
     * <p>The list of supported models in comma-separated format. This parameter is required for model_service.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelList")
    public String modelList;

    /**
     * <p>The network type. Valid values: internet and aliyun-vpc.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("network")
    public String network;

    /**
     * <p>The protocol type. Valid values: openai, openai-compatible, and anthropic. This parameter is required for model_service.</p>
     * 
     * <strong>example:</strong>
     * <p>openai-compatible</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The queries per second (QPS) limit for the dial test registration service. A value of 0 indicates no throttling. Otherwise, valid values are 0.1 to 1000. Default value: 20 for agent_app and 100 for model_service.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("qpsLimit")
    public String qpsLimit;

    /**
     * <p>The region. This parameter is required when the network type is aliyun-vpc.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The JSONPath extraction path for the response body. This parameter is optional for agent_app.</p>
     * 
     * <strong>example:</strong>
     * <p>$.choices[0].message.content</p>
     */
    @NameInMap("responseBodyPath")
    public String responseBodyPath;

    /**
     * <p>The ID of the security group. This parameter is optional for agent_app.</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The timeout period for a single call in milliseconds. Valid values: 1000 to 1800000. Default value: 300000.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("timeoutMs")
    public String timeoutMs;

    /**
     * <p>The ID of the vSwitch. This parameter is optional for agent_app.</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). This parameter is optional for agent_app.</p>
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
