// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTaskDialogueDatasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeContent")
    public Boolean includeContent;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MultimodalSearchType")
    public String multimodalSearchType;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("OriginalSessionId")
    public String originalSessionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>ClusterGenerate</p>
     */
    @NameInMap("SearchModel")
    public String searchModel;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SearchModelDataValue")
    public String searchModelDataValue;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListSearchTaskDialogueDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTaskDialogueDatasRequest self = new ListSearchTaskDialogueDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchTaskDialogueDatasRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public ListSearchTaskDialogueDatasRequest setMultimodalSearchType(String multimodalSearchType) {
        this.multimodalSearchType = multimodalSearchType;
        return this;
    }
    public String getMultimodalSearchType() {
        return this.multimodalSearchType;
    }

    public ListSearchTaskDialogueDatasRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public ListSearchTaskDialogueDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTaskDialogueDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTaskDialogueDatasRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListSearchTaskDialogueDatasRequest setSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    public String getSearchModel() {
        return this.searchModel;
    }

    public ListSearchTaskDialogueDatasRequest setSearchModelDataValue(String searchModelDataValue) {
        this.searchModelDataValue = searchModelDataValue;
        return this;
    }
    public String getSearchModelDataValue() {
        return this.searchModelDataValue;
    }

    public ListSearchTaskDialogueDatasRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListSearchTaskDialogueDatasRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListSearchTaskDialogueDatasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
