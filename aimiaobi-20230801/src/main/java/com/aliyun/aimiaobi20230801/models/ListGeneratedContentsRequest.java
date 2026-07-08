// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsRequest extends TeaModel {
    /**
     * <p>Workspace ID: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Content domain (content category)</p>
     * <ul>
     * <li><p>media: Media writing</p>
     * </li>
     * <li><p>government: Government document writing</p>
     * </li>
     * <li><p>office: Office writing</p>
     * </li>
     * <li><p>market: Marketing writing</p>
     * </li>
     * <li><p>custom: Custom writing</p>
     * </li>
     * <li><p>commentGenerate: Opinion generation</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("ContentDomain")
    public String contentDomain;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>Data type filter</p>
     * <ul>
     * <li><p>plainText: Plain text</p>
     * </li>
     * <li><p>richText: Rich text</p>
     * </li>
     * <li><p>html: HTML</p>
     * </li>
     * <li><p>pdf: PDF</p>
     * </li>
     * <li><p>word: Word</p>
     * </li>
     * <li><p>excel: Excel</p>
     * </li>
     * <li><p>csv: CSV</p>
     * </li>
     * <li><p>image: Image</p>
     * </li>
     * <li><p>video: Video</p>
     * </li>
     * <li><p>audio: Audio</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>plainText</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>End time</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-04 11:46:07</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Search keyword: Supports fuzzy search on titles and content</p>
     * 
     * <strong>example:</strong>
     * <p>检索Query</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Items per page. Default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Start time</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-04 11:46:07</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Task ID</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates it automatically. If you use the same TaskId for multiple tasks, those tasks belong to the same conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>task-03d46184ee7d8749</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Title text</p>
     * 
     * <strong>example:</strong>
     * <p>杭州亚运会</p>
     */
    @NameInMap("Title")
    public String title;

    public static ListGeneratedContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGeneratedContentsRequest self = new ListGeneratedContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListGeneratedContentsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListGeneratedContentsRequest setContentDomain(String contentDomain) {
        this.contentDomain = contentDomain;
        return this;
    }
    public String getContentDomain() {
        return this.contentDomain;
    }

    public ListGeneratedContentsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListGeneratedContentsRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ListGeneratedContentsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListGeneratedContentsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListGeneratedContentsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListGeneratedContentsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListGeneratedContentsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListGeneratedContentsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
