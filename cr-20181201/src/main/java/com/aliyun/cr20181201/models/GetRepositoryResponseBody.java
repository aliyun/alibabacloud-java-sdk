// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepositoryResponseBody extends TeaModel {
    @NameInMap("Summary")
    public String summary;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoStatus")
    public String repoStatus;

    @NameInMap("RepoType")
    public String repoType;

    @NameInMap("RepoBuildType")
    public String repoBuildType;

    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Code")
    public String code;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    @NameInMap("TagImmutability")
    public Boolean tagImmutability;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("Detail")
    public String detail;

    public static GetRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryResponseBody self = new GetRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetRepositoryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepositoryResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepositoryResponseBody setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }
    public String getRepoStatus() {
        return this.repoStatus;
    }

    public GetRepositoryResponseBody setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public GetRepositoryResponseBody setRepoBuildType(String repoBuildType) {
        this.repoBuildType = repoBuildType;
        return this;
    }
    public String getRepoBuildType() {
        return this.repoBuildType;
    }

    public GetRepositoryResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepositoryResponseBody setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public GetRepositoryResponseBody setTagImmutability(Boolean tagImmutability) {
        this.tagImmutability = tagImmutability;
        return this;
    }
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    public GetRepositoryResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetRepositoryResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
