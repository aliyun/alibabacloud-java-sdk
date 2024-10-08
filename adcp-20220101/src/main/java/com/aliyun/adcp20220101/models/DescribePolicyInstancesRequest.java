// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c102fe5f1ee5d4c87a68121a77d8b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACKNoEnvVarSecrets</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DescribePolicyInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesRequest self = new DescribePolicyInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribePolicyInstancesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
