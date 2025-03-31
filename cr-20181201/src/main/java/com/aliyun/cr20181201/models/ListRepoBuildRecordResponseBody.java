// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordResponseBody extends TeaModel {
    /**
     * <p>The list of image building records.</p>
     */
    @NameInMap("BuildRecords")
    public java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> buildRecords;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9D23DEDF-E91D-434B-B7D5-9D12C648D166</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoBuildRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordResponseBody self = new ListRepoBuildRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordResponseBody setBuildRecords(java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> buildRecords) {
        this.buildRecords = buildRecords;
        return this;
    }
    public java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> getBuildRecords() {
        return this.buildRecords;
    }

    public ListRepoBuildRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoBuildRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRecordResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRecordResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoBuildRecordResponseBodyBuildRecordsImage extends TeaModel {
        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.1</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-gzsrlevmvoaq****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        public static ListRepoBuildRecordResponseBodyBuildRecordsImage build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordResponseBodyBuildRecordsImage self = new ListRepoBuildRecordResponseBodyBuildRecordsImage();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class ListRepoBuildRecordResponseBodyBuildRecords extends TeaModel {
        /**
         * <p>The ID of the image building record.</p>
         * 
         * <strong>example:</strong>
         * <p>537e08ab-735e-415f-b7c2-160eb87f8****</p>
         */
        @NameInMap("BuildRecordId")
        public String buildRecordId;

        /**
         * <p>The status of the image building.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("BuildStatus")
        public String buildStatus;

        /**
         * <p>The time when the image building ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1572875610000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The information about the image.</p>
         */
        @NameInMap("Image")
        public ListRepoBuildRecordResponseBodyBuildRecordsImage image;

        /**
         * <p>The time when the image building started.</p>
         * 
         * <strong>example:</strong>
         * <p>1572872207000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListRepoBuildRecordResponseBodyBuildRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordResponseBodyBuildRecords self = new ListRepoBuildRecordResponseBodyBuildRecords();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setBuildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
            return this;
        }
        public String getBuildRecordId() {
            return this.buildRecordId;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setBuildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }
        public String getBuildStatus() {
            return this.buildStatus;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setImage(ListRepoBuildRecordResponseBodyBuildRecordsImage image) {
            this.image = image;
            return this;
        }
        public ListRepoBuildRecordResponseBodyBuildRecordsImage getImage() {
            return this.image;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
