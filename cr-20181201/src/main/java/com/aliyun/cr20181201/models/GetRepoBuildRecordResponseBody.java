// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("Code")
    public String code;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Image")
    public GetRepoBuildRecordResponseBodyImage image;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

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
        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("RepoName")
        public String repoName;

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
