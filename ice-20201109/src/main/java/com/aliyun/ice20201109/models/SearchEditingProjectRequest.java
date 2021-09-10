// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchEditingProjectRequest extends TeaModel {
    // CreateTime（创建时间）的开始时间
    @NameInMap("StartTime")
    public String startTime;

    // CreationTime（创建时间）的结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 云剪辑工程状态。多个用逗号分隔
    @NameInMap("Status")
    public String status;

    // 结果排序方式
    @NameInMap("SortBy")
    public String sortBy;

    // 分页参数
    @NameInMap("NextToken")
    public String nextToken;

    // 分页参数
    @NameInMap("MaxResults")
    public Long maxResults;

    // 创建来源
    @NameInMap("CreateSource")
    public String createSource;

    // 模板类型
    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("ProjectType")
    public String projectType;

    public static SearchEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectRequest self = new SearchEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SearchEditingProjectRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SearchEditingProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchEditingProjectRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchEditingProjectRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchEditingProjectRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public SearchEditingProjectRequest setCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }
    public String getCreateSource() {
        return this.createSource;
    }

    public SearchEditingProjectRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public SearchEditingProjectRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

}
