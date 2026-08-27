// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-08</p>
     */
    @NameInMap("billMonth")
    public String billMonth;

    @NameInMap("filter")
    public String filterShrink;

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
