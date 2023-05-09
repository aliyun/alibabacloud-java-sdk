// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusRequest extends TeaModel {
    /**
     * <p>The mode used to start the on-demand instance. Valid values:</p>
     * <br>
     * <p>*   **manual**: The instance is manually started.</p>
     * <p>*   **netflow-auto**: The instance is automatically started by using NetFlow that monitors network traffic.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The details of the on-demand instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeOnDemandInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusRequest self = new DescribeOnDemandInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeOnDemandInstanceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
