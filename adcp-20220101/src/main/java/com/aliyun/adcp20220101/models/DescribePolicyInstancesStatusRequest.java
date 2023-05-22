// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribePolicyInstancesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesStatusRequest self = new DescribePolicyInstancesStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
