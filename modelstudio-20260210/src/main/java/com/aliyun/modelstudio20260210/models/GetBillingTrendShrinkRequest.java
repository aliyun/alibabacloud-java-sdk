// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingTrendShrinkRequest extends TeaModel {
    /**
     * <p>The dimension filter condition.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The query granularity. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The grouping condition. This parameter must contain exactly one element.</p>
     */
    @NameInMap("groupBy")
    public String groupByShrink;

    /**
     * <p>Specifies whether to query the previous non-overlapping period of the same length. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeHistoryPeriod")
    public Boolean includeHistoryPeriod;

    /**
     * <p>The language of the response. Default value: en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The time range to query, including the start time and end time. This parameter is required.</p>
     */
    @NameInMap("timePeriod")
    public String timePeriodShrink;

    /**
     * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20. The remaining groups are merged into &quot;Other&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
     * <p>Specifies whether to filter out groups with an amount of 0. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("zeroFilter")
    public Boolean zeroFilter;

    public static GetBillingTrendShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillingTrendShrinkRequest self = new GetBillingTrendShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBillingTrendShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetBillingTrendShrinkRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetBillingTrendShrinkRequest setGroupByShrink(String groupByShrink) {
        this.groupByShrink = groupByShrink;
        return this;
    }
    public String getGroupByShrink() {
        return this.groupByShrink;
    }

    public GetBillingTrendShrinkRequest setIncludeHistoryPeriod(Boolean includeHistoryPeriod) {
        this.includeHistoryPeriod = includeHistoryPeriod;
        return this;
    }
    public Boolean getIncludeHistoryPeriod() {
        return this.includeHistoryPeriod;
    }

    public GetBillingTrendShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetBillingTrendShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBillingTrendShrinkRequest setTimePeriodShrink(String timePeriodShrink) {
        this.timePeriodShrink = timePeriodShrink;
        return this;
    }
    public String getTimePeriodShrink() {
        return this.timePeriodShrink;
    }

    public GetBillingTrendShrinkRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public GetBillingTrendShrinkRequest setZeroFilter(Boolean zeroFilter) {
        this.zeroFilter = zeroFilter;
        return this;
    }
    public Boolean getZeroFilter() {
        return this.zeroFilter;
    }

}
