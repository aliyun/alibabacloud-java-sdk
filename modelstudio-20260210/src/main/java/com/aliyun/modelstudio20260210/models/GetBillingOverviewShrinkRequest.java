// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewShrinkRequest extends TeaModel {
    /**
     * <p>The billing month.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08</p>
     */
    @NameInMap("billMonth")
    public String billMonth;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The time granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The list of grouping conditions. Currently, you must specify exactly one grouping dimension.</p>
     */
    @NameInMap("groupBy")
    public String groupByShrink;

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
     * <p>The query time range, which includes the start and end times. Both the start and end times are included in the query range. The time format must be consistent with the granularity, and the start time cannot be later than the end time.</p>
     */
    @NameInMap("timePeriod")
    public String timePeriodShrink;

    /**
     * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20.</p>
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

    public static GetBillingOverviewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillingOverviewShrinkRequest self = new GetBillingOverviewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBillingOverviewShrinkRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public GetBillingOverviewShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetBillingOverviewShrinkRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetBillingOverviewShrinkRequest setGroupByShrink(String groupByShrink) {
        this.groupByShrink = groupByShrink;
        return this;
    }
    public String getGroupByShrink() {
        return this.groupByShrink;
    }

    public GetBillingOverviewShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetBillingOverviewShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBillingOverviewShrinkRequest setTimePeriodShrink(String timePeriodShrink) {
        this.timePeriodShrink = timePeriodShrink;
        return this;
    }
    public String getTimePeriodShrink() {
        return this.timePeriodShrink;
    }

    public GetBillingOverviewShrinkRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public GetBillingOverviewShrinkRequest setZeroFilter(Boolean zeroFilter) {
        this.zeroFilter = zeroFilter;
        return this;
    }
    public Boolean getZeroFilter() {
        return this.zeroFilter;
    }

}
