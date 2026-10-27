// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentRequest extends TeaModel {
    /**
     * <p>The agent permission mode. Valid values:</p>
     * <ul>
     * <li>admin: Administrator mode. The agent has all permissions.</li>
     * <li>restricted: Restricted mode. The agent has only partial permissions.</li>
     * </ul>
     * <p>Default value: admin.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("AgentMode")
    public String agentMode;

    /**
     * <p>Specifies whether to obtain internal network access credentials. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Obtains only internal network connection credentials.</li>
     * <li><code>false</code>: Obtains only public network connection credentials.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
