// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListEditingProjectsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Nzv3rcKla9wHUGua9YXHNA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The queried online editing projects.</p>
     */
    @NameInMap("ProjectList")
    public java.util.List<ListEditingProjectsResponseBodyProjectList> projectList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>ACB-44F2-5F2D-88D7-1283E70</strong></strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEditingProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEditingProjectsResponseBody self = new ListEditingProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEditingProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEditingProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEditingProjectsResponseBody setProjectList(java.util.List<ListEditingProjectsResponseBodyProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<ListEditingProjectsResponseBodyProjectList> getProjectList() {
        return this.projectList;
    }

    public ListEditingProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEditingProjectsResponseBodyProjectList extends TeaModel {
        /**
         * <p>The business configuration of the project. This parameter can be ignored for general editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BusinessConfig")
        public String businessConfig;

        /**
         * <p>The business status of the project. This parameter can be ignored for general editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.com/cover/xxx.jpg">https://xxx.com/cover/xxx.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The method for editing the online editing project. Valid values:</p>
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
         * <p>The time when the online editing project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the online editing project.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error code returned if the production of the online editing project failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the production of the online editing project failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter \&quot;LiveStreamConfig\&quot; is not valid. specified parameter example is not valid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The method for modifying the online editing project last time.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The time when the online editing project was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

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
         * <p>The status of the online editing project. Valid values:</p>
         * <p>\- Draft</p>
         * <p>\- Editing</p>
         * <p>\- Producing</p>
         * <p>\- Produced</p>
         * <p>\- ProduceFailed</p>
         * 
         * <strong>example:</strong>
         * <p>Produced</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>Timeline: a regular template.</li>
         * <li>VETemplate: an advanced template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The title of the online editing project.</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListEditingProjectsResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListEditingProjectsResponseBodyProjectList self = new ListEditingProjectsResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public ListEditingProjectsResponseBodyProjectList setBusinessConfig(String businessConfig) {
            this.businessConfig = businessConfig;
            return this;
        }
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        public ListEditingProjectsResponseBodyProjectList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListEditingProjectsResponseBodyProjectList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListEditingProjectsResponseBodyProjectList setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public ListEditingProjectsResponseBodyProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEditingProjectsResponseBodyProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEditingProjectsResponseBodyProjectList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListEditingProjectsResponseBodyProjectList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListEditingProjectsResponseBodyProjectList setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public ListEditingProjectsResponseBodyProjectList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEditingProjectsResponseBodyProjectList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListEditingProjectsResponseBodyProjectList setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public ListEditingProjectsResponseBodyProjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEditingProjectsResponseBodyProjectList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListEditingProjectsResponseBodyProjectList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
