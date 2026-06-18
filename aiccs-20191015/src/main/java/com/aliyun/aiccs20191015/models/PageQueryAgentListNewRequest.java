// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListNewRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>智能客服助手</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>Indicates whether the agent is available for outbound calls. The value is <code>true</code> if the agent\&quot;s current deployment branch has a published version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    /**
     * <p>The page index. This parameter is deprecated. Use <code>PageNo</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static PageQueryAgentListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListNewRequest self = new PageQueryAgentListNewRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListNewRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
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
