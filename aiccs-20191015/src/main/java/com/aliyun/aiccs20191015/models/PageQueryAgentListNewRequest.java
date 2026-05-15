// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListNewRequest extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static PageQueryAgentListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListNewRequest self = new PageQueryAgentListNewRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListNewRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public PageQueryAgentListNewRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public PageQueryAgentListNewRequest setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public PageQueryAgentListNewRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PageQueryAgentListNewRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PageQueryAgentListNewRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
