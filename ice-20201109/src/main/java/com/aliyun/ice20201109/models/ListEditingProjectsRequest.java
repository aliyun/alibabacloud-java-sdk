// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListEditingProjectsRequest extends TeaModel {
    /**
     * <p>The method for creating the online editing project. Valid values:</p>
     * <p>\- OpenAPI</p>
     * <p>\- AliyunConsole</p>
     * <p>\- WebSDK</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("CreateSource")
    public String createSource;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword. You can search by job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>6f36bc45d09a9d5cde49</strong></strong></strong></p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries per page. A maximum of 100 entries can be returned on each page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the editing project. Valid values:</p>
     * <ul>
     * <li>EditingProject: a regular editing project.</li>
     * <li>LiveEditingProject: a live stream editing project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EditingProject</p>
     */
    @NameInMap("ProjectType")
    public String projectType;

    /**
     * <p>The order of sorting of the results. Valid values:</p>
     * <ul>
     * <li>CreationTime:Desc (default): sorts the results in reverse chronological order.</li>
     * <li>CreationTime:Asc: sorts the results in chronological order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the online editing project. By default, online editing projects in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Produced</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template type. This parameter is required if you create a template-based online editing project. Default value: Timeline.</p>
     * <ul>
     * <li></li>
     * <li></li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>Timeline: a regular template.</li>
     * <li>VETemplate: an advanced template.</li>
     * <li>None: general editing.</li>
     * </ul>
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
