// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSyntheticDetailRequest extends TeaModel {
    @NameInMap("AdvancedFilters")
    public java.util.List<ListSyntheticDetailRequestAdvancedFilters> advancedFilters;

    /**
     * <strong>example:</strong>
     * <p>SYNTHETIC</p>
     */
    @NameInMap("Category")
    public String category;

    /**
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
    public java.util.List<ListSyntheticDetailRequestExactFilters> exactFilters;

    @NameInMap("Filters")
    public java.util.Map<String, String> filters;

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
         * <strong>example:</strong>
         * <p>taskType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
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
        @NameInMap("Key")
        public String key;

        @NameInMap("OpType")
        public String opType;

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
