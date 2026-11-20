// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceStatisticByRegionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeGroupDesktops")
    public Boolean includeGroupDesktops;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    public static DescribeResourceStatisticByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceStatisticByRegionRequest self = new DescribeResourceStatisticByRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceStatisticByRegionRequest setIncludeGroupDesktops(Boolean includeGroupDesktops) {
        this.includeGroupDesktops = includeGroupDesktops;
        return this;
    }
    public Boolean getIncludeGroupDesktops() {
        return this.includeGroupDesktops;
    }

    public DescribeResourceStatisticByRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceStatisticByRegionRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

}
