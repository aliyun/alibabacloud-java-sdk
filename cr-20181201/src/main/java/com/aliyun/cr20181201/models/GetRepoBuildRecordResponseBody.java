// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the image building record.</p>
     * 
     * <strong>example:</strong>
     * <p>79174CBA-8556-443A-8976-22C922D7****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the image building was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>1568718698000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The information about the image.</p>
     */
    @NameInMap("Image")
    public GetRepoBuildRecordResponseBodyImage image;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a78ec6fb-16ea-4649-93b7-f52afba7d9de1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the image building started.</p>
     * 
     * <strong>example:</strong>
     * <p>1568718468000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetRepoBuildRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordResponseBody self = new GetRepoBuildRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordResponseBody setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public GetRepoBuildRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoBuildRecordResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetRepoBuildRecordResponseBody setImage(GetRepoBuildRecordResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public GetRepoBuildRecordResponseBodyImage getImage() {
        return this.image;
    }

    public GetRepoBuildRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoBuildRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoBuildRecordResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetRepoBuildRecordResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetRepoBuildRecordResponseBodyImage extends TeaModel {
        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        public static GetRepoBuildRecordResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            GetRepoBuildRecordResponseBodyImage self = new GetRepoBuildRecordResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public GetRepoBuildRecordResponseBodyImage setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetRepoBuildRecordResponseBodyImage setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetRepoBuildRecordResponseBodyImage setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

}
