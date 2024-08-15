// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSyntheticDetailShrinkRequest extends TeaModel {
    /**
     * <p>An array of filter conditions. This parameter is required.</p>
     * <ul>
     * <li>To query the list of synthetic test results, set this parameter in the following format: [{&quot;Key&quot;:&quot;taskType&quot;,&quot;OpType&quot;:&quot;in&quot;,&quot;Value&quot;:[Task type]}].</li>
     * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: [{&quot;Key&quot;:&quot;dataId&quot;,&quot;OpType&quot;:&quot;eq&quot;,&quot;Value&quot;:&quot;dataId&quot;}]. dataId is returned when you query the list of synthetic test results.</li>
     * </ul>
     */
    @NameInMap("AdvancedFilters")
    public String advancedFiltersShrink;

    /**
     * <strong>example:</strong>
     * <p>SYNTHETIC</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The type of the list that contains the results. This parameter is required. Valid values:</p>
     * <ul>
     * <li>ICMP_LIST</li>
     * <li>TCP_LIST</li>
     * <li>DNS_LIST</li>
     * <li>HTTP_LIST</li>
     * <li>WEBSITE_LIST</li>
     * <li>DOWNLOAD_LIST</li>
     * <li>ALL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ICMP_LIST</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>1684480557772</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExactFilters")
    public String exactFiltersShrink;

    /**
     * <p>The filter condition. This parameter is required.</p>
     * <ul>
     * <li>To query the result of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;}.</li>
     * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;,&quot;dataId&quot;:&quot;${dataId}&quot;}.</li>
     * </ul>
     */
    @NameInMap("Filters")
    public String filtersShrink;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>timestamp</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1684110343127</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SyntheticType")
    public Integer syntheticType;

    public static ListSyntheticDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyntheticDetailShrinkRequest self = new ListSyntheticDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSyntheticDetailShrinkRequest setAdvancedFiltersShrink(String advancedFiltersShrink) {
        this.advancedFiltersShrink = advancedFiltersShrink;
        return this;
    }
    public String getAdvancedFiltersShrink() {
        return this.advancedFiltersShrink;
    }

    public ListSyntheticDetailShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListSyntheticDetailShrinkRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ListSyntheticDetailShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListSyntheticDetailShrinkRequest setExactFiltersShrink(String exactFiltersShrink) {
        this.exactFiltersShrink = exactFiltersShrink;
        return this;
    }
    public String getExactFiltersShrink() {
        return this.exactFiltersShrink;
    }

    public ListSyntheticDetailShrinkRequest setFiltersShrink(String filtersShrink) {
        this.filtersShrink = filtersShrink;
        return this;
    }
    public String getFiltersShrink() {
        return this.filtersShrink;
    }

    public ListSyntheticDetailShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSyntheticDetailShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSyntheticDetailShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSyntheticDetailShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSyntheticDetailShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSyntheticDetailShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListSyntheticDetailShrinkRequest setSyntheticType(Integer syntheticType) {
        this.syntheticType = syntheticType;
        return this;
    }
    public Integer getSyntheticType() {
        return this.syntheticType;
    }

}
