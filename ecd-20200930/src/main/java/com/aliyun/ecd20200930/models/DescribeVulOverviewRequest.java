// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulOverviewRequest extends TeaModel {
    /**
     * <p>The number of medium-risk vulnerabilities.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeVulOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulOverviewRequest self = new DescribeVulOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
