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
    public String agentId;

    /**
     * <p>The agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>Intelligent Customer Service Assistant</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>Specifies whether to return only candidate agents that are configurable for inbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InboundConfigurableOnly")
    public Boolean inboundConfigurableOnly;

    /**
     * <p>Specifies whether the agent is available for outbound calls. A value of True indicates that the current deployment branch of the agent has a published version and is available for outbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    /**
     * <p>The page number. This parameter is deprecated. Use PageNo instead.</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The service direction.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("ServiceDirection")
    public String serviceDirection;

    /**
     * <p>The source template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

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

    public PageQueryAgentListNewRequest setInboundConfigurableOnly(Boolean inboundConfigurableOnly) {
        this.inboundConfigurableOnly = inboundConfigurableOnly;
        return this;
    }
    public Boolean getInboundConfigurableOnly() {
        return this.inboundConfigurableOnly;
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

    public PageQueryAgentListNewRequest setServiceDirection(String serviceDirection) {
        this.serviceDirection = serviceDirection;
        return this;
    }
    public String getServiceDirection() {
        return this.serviceDirection;
    }

    public PageQueryAgentListNewRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
