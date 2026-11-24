// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation time, represented as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1570759546000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The detailed information.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The last modification time, represented as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1570759546100</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The repository build type. Valid values:</p>
     * <ul>
     * <li><p><code>MANUAL</code>: manually triggered build.</p>
     * </li>
     * <li><p><code>AUTO</code>: automatically triggered build.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MANUAL</p>
     */
    @NameInMap("RepoBuildType")
    public String repoBuildType;

    /**
     * <p>The repository ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-l5eoubonp0l****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The repository status.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RepoStatus")
    public String repoStatus;

    /**
     * <p>The repository type. Valid values:</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: public repository.</p>
     * </li>
     * <li><p><code>PRIVATE</code>: private repository.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>915E6734-3E50-4640-8DBA-126D2D94DE29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv36i4is****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The summary information.</p>
     * 
     * <strong>example:</strong>
     * <p>Automatically created repository</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The image tag immutability setting. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enabled.</p>
     * </li>
     * <li><p><code>false</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
