// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSessionRequest extends TeaModel {
    /**
     * <p>Session creation end time</p>
     * 
     * <strong>example:</strong>
     * <p>1770912000000</p>
     */
    @NameInMap("CreateEndTime")
    public Long createEndTime;

    /**
     * <p>Session creation start time</p>
     * 
     * <strong>example:</strong>
     * <p>1770825600000</p>
     */
    @NameInMap("CreateStartTime")
    public Long createStartTime;

    /**
     * <p>Custom Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>ca-4y3ca4khkcu**********ysf</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>Current DMS unit</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>Whether to return only saved sessions</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSaved")
    public Boolean isSaved;

    /**
     * <p>Page number for pagination</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of records per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Session type. Required when you specify a collaboration workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>myFavorite</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>Data Agent title (supports fuzzy search)</p>
     * 
     * <strong>example:</strong>
     * <p>帮我分析一下这份数据</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Collaboration workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSessionRequest self = new ListDataAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSessionRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListDataAgentSessionRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListDataAgentSessionRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public ListDataAgentSessionRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ListDataAgentSessionRequest setIsSaved(Boolean isSaved) {
        this.isSaved = isSaved;
        return this;
    }
    public Boolean getIsSaved() {
        return this.isSaved;
    }

    public ListDataAgentSessionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentSessionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentSessionRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListDataAgentSessionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListDataAgentSessionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
