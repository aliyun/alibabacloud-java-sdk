// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesRequest extends TeaModel {
    /**
     * <p>The name of the policy instance that you want to query.</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    /**
     * <p>The name of the policy that you want to query.</p>
     */
    @NameInMap("policy_name")
    public String policyName;

    public static DescribePolicyInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesRequest self = new DescribePolicyInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribePolicyInstancesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
