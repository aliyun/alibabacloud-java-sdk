// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsInput extends TeaModel {
    /**
     * <p>按端点名称过滤</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

    /**
     * <p>页码</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页记录数</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>按状态过滤</p>
     */
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    public static ListAgentRuntimeEndpointsInput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeEndpointsInput self = new ListAgentRuntimeEndpointsInput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeEndpointsInput setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public ListAgentRuntimeEndpointsInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimeEndpointsInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimeEndpointsInput setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
