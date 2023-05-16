// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionBandwidthQuotaRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRegionBandwidthQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionBandwidthQuotaRequest self = new DescribeRegionBandwidthQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionBandwidthQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
