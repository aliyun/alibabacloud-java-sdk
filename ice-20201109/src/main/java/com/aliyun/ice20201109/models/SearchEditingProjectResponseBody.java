// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 云剪辑工程列表
    @NameInMap("ProjectList")
    public java.util.List<SearchEditingProjectResponseBodyProjectList> projectList;

    // 云剪辑工程总数
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    public static SearchEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponseBody self = new SearchEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEditingProjectResponseBody setProjectList(java.util.List<SearchEditingProjectResponseBodyProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<SearchEditingProjectResponseBodyProjectList> getProjectList() {
        return this.projectList;
    }

    public SearchEditingProjectResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public SearchEditingProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SearchEditingProjectResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class SearchEditingProjectResponseBodyProjectList extends TeaModel {
        // 云剪辑工程ID
        @NameInMap("ProjectId")
        public String projectId;

        // 云剪辑工程标题
        @NameInMap("Title")
        public String title;

        // 云剪辑工程时间线
        @NameInMap("Timeline")
        public String timeline;

        // 云剪辑工程描述
        @NameInMap("Description")
        public String description;

        // 云剪辑工程封面
        @NameInMap("CoverURL")
        public String coverURL;

        // 云剪辑工程创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 云剪辑工程最新修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 云剪辑工程总时长
        @NameInMap("Duration")
        public Long duration;

        // 云剪辑工程状态
        @NameInMap("Status")
        public String status;

        // 云剪辑工程合成失败的错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 云剪辑工程合成失败的消息
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 创建来源
        @NameInMap("CreateSource")
        public String createSource;

        // 最后一次修改来源
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        // 模板类型
        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("ProjectType")
        public String projectType;

        @NameInMap("BusinessConfig")
        public String businessConfig;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        public static SearchEditingProjectResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectList self = new SearchEditingProjectResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public SearchEditingProjectResponseBodyProjectList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public SearchEditingProjectResponseBodyProjectList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchEditingProjectResponseBodyProjectList setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public SearchEditingProjectResponseBodyProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchEditingProjectResponseBodyProjectList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchEditingProjectResponseBodyProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchEditingProjectResponseBodyProjectList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchEditingProjectResponseBodyProjectList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchEditingProjectResponseBodyProjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchEditingProjectResponseBodyProjectList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SearchEditingProjectResponseBodyProjectList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SearchEditingProjectResponseBodyProjectList setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public SearchEditingProjectResponseBodyProjectList setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public SearchEditingProjectResponseBodyProjectList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public SearchEditingProjectResponseBodyProjectList setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public SearchEditingProjectResponseBodyProjectList setBusinessConfig(String businessConfig) {
            this.businessConfig = businessConfig;
            return this;
        }
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        public SearchEditingProjectResponseBodyProjectList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

    }

}
