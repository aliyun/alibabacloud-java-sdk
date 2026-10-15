// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the account. If this parameter is left empty, data of the current account and its trusteeship linked accounts is queried. You can specify a trusteeship linked account ID to query data of that account.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end time. Format: yyyy-MM-dd HH:mm:ss. The query excludes data at this time. If this parameter is left empty, the query covers data up to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-02 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("FilterParam")
    public String filterParamShrink;

    /**
     * <p>The maximum number of data records to return. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The time granularity for querying usage details. Valid values:</p>
     * <ul>
     * <li>MONTH: monthly granularity.</li>
     * <li>DAY: daily granularity.</li>
     * <li>HOUR: hourly granularity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The start time. Format: yyyy-MM-dd HH:mm:ss. The query includes data at this time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    /**
     * <p>The pagination token. Leave this parameter empty for the first page. The query result returns the token for the next page. If the returned token is empty, all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeSavingsPlansUsageDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageDetailShrinkRequest self = new DescribeSavingsPlansUsageDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setFilterParamShrink(String filterParamShrink) {
        this.filterParamShrink = filterParamShrink;
        return this;
    }
    public String getFilterParamShrink() {
        return this.filterParamShrink;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansUsageDetailShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
