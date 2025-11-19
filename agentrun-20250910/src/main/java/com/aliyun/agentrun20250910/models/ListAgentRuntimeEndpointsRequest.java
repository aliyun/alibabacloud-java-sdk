// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsRequest extends TeaModel {
    /**
     * <p>根据端点名称进行模糊匹配过滤</p>
     * 
     * <strong>example:</strong>
     * <p>my-endpoint</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

    /**
     * <p>当前页码，从1开始计数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的记录数量</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>查询模式，支持精确查询和模糊查询</p>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("searchMode")
    public String searchMode;

    public static ListAgentRuntimeEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeEndpointsRequest self = new ListAgentRuntimeEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeEndpointsRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public ListAgentRuntimeEndpointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimeEndpointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimeEndpointsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

}
