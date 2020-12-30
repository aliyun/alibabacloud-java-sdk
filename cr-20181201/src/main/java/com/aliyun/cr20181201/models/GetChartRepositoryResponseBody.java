// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartRepositoryResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RepoStatus")
    public String repoStatus;

    @NameInMap("RepoType")
    public String repoType;

    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Code")
    public String code;

    public static GetChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChartRepositoryResponseBody self = new GetChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetChartRepositoryResponseBody setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public GetChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetChartRepositoryResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetChartRepositoryResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetChartRepositoryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetChartRepositoryResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetChartRepositoryResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetChartRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
