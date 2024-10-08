// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c676decda7b8148d69a9aba751877****</p>
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
