// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListRateLimitRulesOutput extends TeaModel {
    /**
     * <p>The list of rate-limiting rules.</p>
     */
    @NameInMap("items")
    public java.util.List<RateLimitRule> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The total number of matching rate-limiting rules.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListRateLimitRulesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListRateLimitRulesOutput self = new ListRateLimitRulesOutput();
        return TeaModel.build(map, self);
    }

    public ListRateLimitRulesOutput setItems(java.util.List<RateLimitRule> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RateLimitRule> getItems() {
        return this.items;
    }

    public ListRateLimitRulesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRateLimitRulesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRateLimitRulesOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
