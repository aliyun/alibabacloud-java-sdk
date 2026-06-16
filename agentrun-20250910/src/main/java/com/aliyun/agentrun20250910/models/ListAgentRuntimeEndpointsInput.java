// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsInput extends TeaModel {
    /**
     * <p>Filter by endpoint name</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

    /**
     * <p>Page number</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of records per page</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filter by status</p>
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
