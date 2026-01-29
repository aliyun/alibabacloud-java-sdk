// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the account for which you want to query coverage details.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-09 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("FilterParam")
    public String filterParamShrink;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The time granularity at which coverage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-15 13:40:45</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query coverage details within a specific time range for the first time. The response returns a token that you can use to query coverage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more coverage details can be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeSavingsPlansCoverageDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageDetailShrinkRequest self = new DescribeSavingsPlansCoverageDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setFilterParamShrink(String filterParamShrink) {
        this.filterParamShrink = filterParamShrink;
        return this;
    }
    public String getFilterParamShrink() {
        return this.filterParamShrink;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansCoverageDetailShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
