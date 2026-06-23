// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSearchRequest extends TeaModel {
    /**
     * <p>Page number, starting from 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Number of items per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Search query content</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>特朗普最新关税消息</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Web page publish time range</p>
     * 
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static GlobalSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalSearchRequest self = new GlobalSearchRequest();
        return TeaModel.build(map, self);
    }

    public GlobalSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GlobalSearchRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GlobalSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GlobalSearchRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
