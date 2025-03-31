// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the chart repository was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1563767620000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The time when the chart repository was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1563767700000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The ID of the chart repository.</p>
     * 
     * <strong>example:</strong>
     * <p>crcr-c7letfwev5oq****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The name of the chart repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace to which the chart repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The status of the chart repository. Valid values:</p>
     * <ul>
     * <li><code>NORMAL</code>: The repository is normal.</li>
     * <li><code>DELETING</code>: The repository is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RepoStatus")
    public String repoStatus;

    /**
     * <p>The type of the chart repository. Valid values:</p>
     * <ul>
     * <li><code>PUBLIC</code>: a public repository</li>
     * <li><code>PRIVATE</code>: a private repository</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3F6AB56-DEF4-4FF5-8DE4-680362C0E21F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv36i4is****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The summary about the chart repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Summary")
    public String summary;

    public static GetChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChartRepositoryResponseBody self = new GetChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChartRepositoryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetChartRepositoryResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetChartRepositoryResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetChartRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetChartRepositoryResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetChartRepositoryResponseBody setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public GetChartRepositoryResponseBody setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }
    public String getRepoStatus() {
        return this.repoStatus;
    }

    public GetChartRepositoryResponseBody setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public GetChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChartRepositoryResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetChartRepositoryResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
