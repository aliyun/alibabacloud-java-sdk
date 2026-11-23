// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceStatisticByRegionRequest extends TeaModel {
    /**
     * <p>Specifies whether the statistics include the number of shared cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeGroupDesktops")
    public Boolean includeGroupDesktops;

    /**
     * <p>The ID of the service region. Valid values: China (Shanghai) and Singapore.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the region to search. This parameter is used to filter cloud desktops in the specified region.</p>
     * 
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
