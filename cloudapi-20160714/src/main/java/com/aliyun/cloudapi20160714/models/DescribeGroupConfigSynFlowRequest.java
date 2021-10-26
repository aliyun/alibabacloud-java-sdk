// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupConfigSynFlowRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("FlowId")
    public String flowId;

    public static DescribeGroupConfigSynFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupConfigSynFlowRequest self = new DescribeGroupConfigSynFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupConfigSynFlowRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGroupConfigSynFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
