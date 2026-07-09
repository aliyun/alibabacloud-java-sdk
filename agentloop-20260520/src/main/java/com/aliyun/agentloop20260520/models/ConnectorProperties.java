// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ConnectorProperties extends TeaModel {
    @NameInMap("channelType")
    public String channelType;

    @NameInMap("dryRunRequestBody")
    public String dryRunRequestBody;

    @NameInMap("modelList")
    public String modelList;

    @NameInMap("network")
    public String network;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("region")
    public String region;

    @NameInMap("responseBodyPath")
    public String responseBodyPath;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchId")
    public String vSwitchId;

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
