// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingTrendShrinkRequest extends TeaModel {
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("granularity")
    public String granularity;

    @NameInMap("groupBy")
    public String groupByShrink;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("timePeriod")
    public String timePeriodShrink;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
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
