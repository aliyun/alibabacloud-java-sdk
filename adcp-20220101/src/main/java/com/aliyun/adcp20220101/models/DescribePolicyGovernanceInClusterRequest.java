// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c09946603cd764dac96135f51d1ba****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribePolicyGovernanceInClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGovernanceInClusterRequest self = new DescribePolicyGovernanceInClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGovernanceInClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
