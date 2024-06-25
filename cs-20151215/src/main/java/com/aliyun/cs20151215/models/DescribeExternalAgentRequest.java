// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentRequest extends TeaModel {
    /**
     * <p>The permission mode of the agent. Valid values:</p>
     * <p>admin: the admin mode, which provides full permissions. restricted: the restricted mode, which provides partial permissions. Default value: admin.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("AgentMode")
    public String agentMode;

    /**
     * <p>Specifies whether to obtain the credentials that are used to access the cluster over the internal network.</p>
     * <ul>
     * <li><code>true</code>: obtains the credentials that are used to access the cluster over the internal network.</li>
     * <li><code>false</code>: obtains the credentials that are used to access the cluster over the Internet.</li>
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
