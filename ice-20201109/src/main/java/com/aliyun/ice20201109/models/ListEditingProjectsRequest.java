// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListEditingProjectsRequest extends TeaModel {
    /**
     * <p>The creation source. Valid values:</p>
     * <ul>
     * <li>OpenAPI</li>
     * <li>AliyunConsole</li>
     * <li>WebSDK</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("CreateSource")
    public String createSource;

    /**
     * <p>The end time of the creation time range. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword. You can search for projects by task ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>6f36bc45d09a9d5cde49</strong></strong></strong></p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the editing project. Valid values:</p>
     * <ul>
     * <li>EditingProject: regular editing project.</li>
     * <li>LiveEditingProject: live editing project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EditingProject</p>
     */
    @NameInMap("ProjectType")
    public String projectType;

    /**
     * <p>The sorting method of the query results. Valid values:</p>
     * <ul>
     * <li>CreationTime:Desc: sorts the results in descending order of creation time. This is the default value.</li>
     * <li>CreationTime:Asc: sorts the results in ascending order of creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the creation time range. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the cloud editing project. By default, all cloud editing projects are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Produced</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The templatetype. This parameter is required when you create a template-based cloud editing project. Default value: Timeline.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListEditingProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEditingProjectsRequest self = new ListEditingProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListEditingProjectsRequest setCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }
    public String getCreateSource() {
        return this.createSource;
    }

    public ListEditingProjectsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEditingProjectsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEditingProjectsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListEditingProjectsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEditingProjectsRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public ListEditingProjectsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListEditingProjectsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListEditingProjectsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEditingProjectsRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
