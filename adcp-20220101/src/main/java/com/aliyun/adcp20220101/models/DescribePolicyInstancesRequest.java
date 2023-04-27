// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
