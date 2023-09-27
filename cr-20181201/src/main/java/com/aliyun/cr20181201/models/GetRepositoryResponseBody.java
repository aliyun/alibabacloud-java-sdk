// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the repository was created.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The details of the repository.</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The time when the repository was last modified.</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>Indicates how the repository was created. Valid values:</p>
     * <br>
     * <p>*   `MANUAL`: The repository was manually created.</p>
     * <p>*   `AUTO`: The repository was automatically created.</p>
     */
    @NameInMap("RepoBuildType")
    public String repoBuildType;

    /**
     * <p>The ID of the repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The name of the repository.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The status of the repository.</p>
     */
    @NameInMap("RepoStatus")
    public String repoStatus;

    /**
     * <p>The type of the repository. Valid values:</p>
     * <br>
     * <p>*   `PUBLIC`: public repository.</p>
     * <p>*   `PRIVATE`: private repository.</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The summary of the repository.</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>Indicates whether the feature of image tag immutability is enabled. Valid values:</p>
     * <br>
     * <p>*   `true`: The feature of image tag immutability is enabled.</p>
     * <p>*   `false`: The feature of image tag immutability is disabled.</p>
     */
    @NameInMap("TagImmutability")
    public Boolean tagImmutability;

    public static GetRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryResponseBody self = new GetRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepositoryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetRepositoryResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GetRepositoryResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepositoryResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetRepositoryResponseBody setRepoBuildType(String repoBuildType) {
        this.repoBuildType = repoBuildType;
        return this;
    }
    public String getRepoBuildType() {
        return this.repoBuildType;
    }

    public GetRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepositoryResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetRepositoryResponseBody setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
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

    public GetRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetRepositoryResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetRepositoryResponseBody setTagImmutability(Boolean tagImmutability) {
        this.tagImmutability = tagImmutability;
        return this;
    }
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

}
