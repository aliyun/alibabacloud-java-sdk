// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesInput extends TeaModel {
    /**
     * <p>按名称过滤</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

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

    public static ListAgentRuntimesInput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesInput self = new ListAgentRuntimesInput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesInput setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public ListAgentRuntimesInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimesInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimesInput setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
