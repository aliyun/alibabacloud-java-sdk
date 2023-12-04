// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusRequest extends TeaModel {
    /**
     * <p>The IDs of on-demand instances.</p>
     * <br>
     * <p>>  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.</p>
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
