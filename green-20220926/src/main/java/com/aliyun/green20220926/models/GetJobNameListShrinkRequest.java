// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetJobNameListShrinkRequest extends TeaModel {
    /**
     * <p>The end time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-24 10:01:55</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The query conditions. This parameter is required and must be a valid JSON query condition, such as {&quot;TaskId&quot;:&quot;P_11TL5T&quot;}. Before calling this operation, call GetStockOssCheckTasksList to obtain an available TaskId. If this parameter is not provided, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TaskId&quot;:&quot;P_11TL5T&quot;}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;StartTime&quot;:&quot;desc&quot;}</p>
     */
    @NameInMap("Sort")
    public String sortShrink;

    /**
     * <p>The start time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-11 09:00:19</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static GetJobNameListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobNameListShrinkRequest self = new GetJobNameListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetJobNameListShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetJobNameListShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetJobNameListShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetJobNameListShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public GetJobNameListShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
