// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAggregatedDesktopsRequest extends TeaModel {
    /**
     * <p>The aggregation factor.</p>
     * 
     * <strong>example:</strong>
     * <p>STATUS</p>
     */
    @NameInMap("AggregationFactor")
    public String aggregationFactor;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the list of regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The search region ID. Used to filter desktop information for a specified region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    public static GetAggregatedDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatedDesktopsRequest self = new GetAggregatedDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregatedDesktopsRequest setAggregationFactor(String aggregationFactor) {
        this.aggregationFactor = aggregationFactor;
        return this;
    }
    public String getAggregationFactor() {
        return this.aggregationFactor;
    }

    public GetAggregatedDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAggregatedDesktopsRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

}
