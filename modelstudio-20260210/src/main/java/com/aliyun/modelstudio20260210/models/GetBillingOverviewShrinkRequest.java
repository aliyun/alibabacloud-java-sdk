// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewShrinkRequest extends TeaModel {
    /**
     * <p>The billing month. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08</p>
     */
    @NameInMap("billMonth")
    public String billMonth;

    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The list of grouping conditions. Currently, you must specify exactly one grouping dimension.</p>
     */
    @NameInMap("groupBy")
    public String groupByShrink;

    /**
     * <p>The response language. Default value: en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
     * <p>Specifies whether to filter out groups with a zero amount. Default value: true.</p>
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
