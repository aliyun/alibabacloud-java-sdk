// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesInput extends TeaModel {
    /**
     * <p>Filters the results by agent runtime name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>The page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results by status.</p>
     * 
     * <strong>example:</strong>
     * <p>READY,CREATING</p>
     */
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    /**
     * <p>按系统标签过滤</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:tag1,acs:ecs:tag2</p>
     */
    @NameInMap("systemTags")
    public java.util.List<String> systemTags;

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

    public ListAgentRuntimesInput setSystemTags(java.util.List<String> systemTags) {
        this.systemTags = systemTags;
        return this;
    }
    public java.util.List<String> getSystemTags() {
        return this.systemTags;
    }

}
