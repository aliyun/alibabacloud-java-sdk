// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned by the current request. The number of records on each page before the last page is the value of MaxResults. Examples: Valid example: 10, 10, 5. Invalid example: 10, 5, 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that indicates the position where the current call stops reading. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The cloud editing project list.</p>
     */
    @NameInMap("ProjectList")
    public java.util.List<SearchEditingProjectResponseBodyProjectList> projectList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data entries that meet the request conditions. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponseBody self = new SearchEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public SearchEditingProjectResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchEditingProjectResponseBody setProjectList(java.util.List<SearchEditingProjectResponseBodyProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<SearchEditingProjectResponseBodyProjectList> getProjectList() {
        return this.projectList;
    }

    public SearchEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEditingProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchEditingProjectResponseBodyProjectList extends TeaModel {
        /**
         * <p>The business configuration of the project. You can ignore this parameter for general editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
         */
        @NameInMap("BusinessConfig")
        public String businessConfig;

        /**
         * <p>The business status of the project. You can ignore this parameter for general editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserving</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The cover of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example-cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example-cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The editing method of the cloud editing project. Valid values:</p>
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
         * <p>The creation time of the cloud editing project. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>sample description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total duration of the cloud editing project. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30.100000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The error code returned when the production of the cloud editing project fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the production of the cloud editing project fails.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;EventTime&quot;:&quot;2021-08-12T10:04:15Z&quot;,&quot;ErrorCode&quot;:&quot;InvalidParameter&quot;,&quot;ErrorMessage&quot;:&quot;The specified parameter \&quot;LiveStreamConfig\&quot; is not valid. specified parameter example is not valid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The source of the last modification.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The last modification time of the cloud editing project. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The type of the editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>EditingProject</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        /**
         * <p>The list of all cloud editing project statuses. Valid values:</p>
         * <ul>
         * <li>Draft</li>
         * <li>Editing</li>
         * <li>Producing</li>
         * <li>Produced</li>
         * <li>ProduceFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRODUCE_FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The timeline of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The title of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        public static SearchEditingProjectResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectList self = new SearchEditingProjectResponseBodyProjectList();
            return TeaModel.build(map, self);
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

        public SearchEditingProjectResponseBodyProjectList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchEditingProjectResponseBodyProjectList setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public SearchEditingProjectResponseBodyProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchEditingProjectResponseBodyProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchEditingProjectResponseBodyProjectList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
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

        public SearchEditingProjectResponseBodyProjectList setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public SearchEditingProjectResponseBodyProjectList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchEditingProjectResponseBodyProjectList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public SearchEditingProjectResponseBodyProjectList setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public SearchEditingProjectResponseBodyProjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchEditingProjectResponseBodyProjectList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public SearchEditingProjectResponseBodyProjectList setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public SearchEditingProjectResponseBodyProjectList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
