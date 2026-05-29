// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderEndpointsRequest extends TeaModel {
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    @NameInMap("AgentProvider")
    public String agentProvider;

    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("ProviderName")
    public String providerName;

    public static ListModelProviderEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderEndpointsRequest self = new ListModelProviderEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProviderEndpointsRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListModelProviderEndpointsRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ListModelProviderEndpointsRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListModelProviderEndpointsRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
