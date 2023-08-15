// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentRequest extends TeaModel {
    @NameInMap("AgentMode")
    public String agentMode;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    public static DescribeExternalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalAgentRequest self = new DescribeExternalAgentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExternalAgentRequest setAgentMode(String agentMode) {
        this.agentMode = agentMode;
        return this;
    }
    public String getAgentMode() {
        return this.agentMode;
    }

    public DescribeExternalAgentRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

}
