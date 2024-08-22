// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSyntheticDetailRequest extends TeaModel {
    /**
     * <p>An array of filter conditions. This parameter is required.</p>
     * <ul>
     * <li>To query the list of synthetic test results, set this parameter in the following format: [{&quot;Key&quot;:&quot;taskType&quot;,&quot;OpType&quot;:&quot;in&quot;,&quot;Value&quot;:[Task type]}].</li>
     * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: [{&quot;Key&quot;:&quot;dataId&quot;,&quot;OpType&quot;:&quot;eq&quot;,&quot;Value&quot;:&quot;dataId&quot;}]. dataId is returned when you query the list of synthetic test results.</li>
     * </ul>
     */
    @NameInMap("AdvancedFilters")
    public java.util.List<ListSyntheticDetailRequestAdvancedFilters> advancedFilters;

    /**
     * <p>The type of the results. Set the value to SYNTHETIC.</p>
     * 
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
     * <p>The timestamp of the end time of the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1684480557772</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>A reserved field.</p>
     */
    @NameInMap("ExactFilters")
    public java.util.List<ListSyntheticDetailRequestExactFilters> exactFilters;

    /**
     * <p>The filter condition. This parameter is required.</p>
     * <ul>
     * <li>To query the result of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;}.</li>
     * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;,&quot;dataId&quot;:&quot;${dataId}&quot;}.</li>
     * </ul>
     */
    @NameInMap("Filters")
    public java.util.Map<String, String> filters;

    /**
     * <p>The order in which results are sorted. Valid values:</p>
     * <ul>
     * <li><code>ASC</code>: ascending order</li>
     * <li><code>DESC</code>: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field based on which results are sorted. Set the value to timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>timestamp</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timestamp of the start time of the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1684110343127</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type of the synthetic test. Valid values: 1 and 2. 1 represents an immediate test, and 2 represents a scheduled test.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SyntheticType")
    public Integer syntheticType;

    public static ListSyntheticDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyntheticDetailRequest self = new ListSyntheticDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListSyntheticDetailRequest setAdvancedFilters(java.util.List<ListSyntheticDetailRequestAdvancedFilters> advancedFilters) {
        this.advancedFilters = advancedFilters;
        return this;
    }
    public java.util.List<ListSyntheticDetailRequestAdvancedFilters> getAdvancedFilters() {
        return this.advancedFilters;
    }

    public ListSyntheticDetailRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListSyntheticDetailRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ListSyntheticDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListSyntheticDetailRequest setExactFilters(java.util.List<ListSyntheticDetailRequestExactFilters> exactFilters) {
        this.exactFilters = exactFilters;
        return this;
    }
    public java.util.List<ListSyntheticDetailRequestExactFilters> getExactFilters() {
        return this.exactFilters;
    }

    public ListSyntheticDetailRequest setFilters(java.util.Map<String, String> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, String> getFilters() {
        return this.filters;
    }

    public ListSyntheticDetailRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSyntheticDetailRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSyntheticDetailRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSyntheticDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSyntheticDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSyntheticDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListSyntheticDetailRequest setSyntheticType(Integer syntheticType) {
        this.syntheticType = syntheticType;
        return this;
    }
    public Integer getSyntheticType() {
        return this.syntheticType;
    }

    public static class ListSyntheticDetailRequestAdvancedFilters extends TeaModel {
        /**
         * <p>The filter condition. The taskType and dataId fields are supported.</p>
         * <ul>
         * <li>To query the list of synthetic test results, set the key to taskType.</li>
         * <li>To query the result details of a synthetic monitoring task, set the key to dataId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>taskType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the filter condition. Valid values: eq and in. eq: equal to. in: include.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The value of the filter condition. The type of the task. Valid values: 1: ICMP 2: TCP 3: DNS 4: HTTP 5: website speed measurement 6: file download</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public Object value;

        public static ListSyntheticDetailRequestAdvancedFilters build(java.util.Map<String, ?> map) throws Exception {
            ListSyntheticDetailRequestAdvancedFilters self = new ListSyntheticDetailRequestAdvancedFilters();
            return TeaModel.build(map, self);
        }

        public ListSyntheticDetailRequestAdvancedFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSyntheticDetailRequestAdvancedFilters setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public ListSyntheticDetailRequestAdvancedFilters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListSyntheticDetailRequestExactFilters extends TeaModel {
        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Value")
        public Object value;

        public static ListSyntheticDetailRequestExactFilters build(java.util.Map<String, ?> map) throws Exception {
            ListSyntheticDetailRequestExactFilters self = new ListSyntheticDetailRequestExactFilters();
            return TeaModel.build(map, self);
        }

        public ListSyntheticDetailRequestExactFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSyntheticDetailRequestExactFilters setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public ListSyntheticDetailRequestExactFilters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
