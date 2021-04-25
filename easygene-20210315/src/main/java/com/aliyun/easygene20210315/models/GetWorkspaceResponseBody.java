// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 工作空间简要描述
    @NameInMap("Description")
    public String description;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 工作空间内作业生命周期
    @NameInMap("JobLifecycle")
    public Integer jobLifecycle;

    // 工作空间标签
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    // 工作空间内OSS上的工作路径
    @NameInMap("OssRoot")
    public String ossRoot;

    // 工作空间Bucket
    @NameInMap("BucketName")
    public String bucketName;

    // 工作空间内默认的RAM服务角色
    @NameInMap("Role")
    public String role;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 最后修改时间
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 工作空间状态
    @NameInMap("Status")
    public String status;

    // 地域ID
    @NameInMap("RegionId")
    public String regionId;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetWorkspaceResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetWorkspaceResponseBody setJobLifecycle(Integer jobLifecycle) {
        this.jobLifecycle = jobLifecycle;
        return this;
    }
    public Integer getJobLifecycle() {
        return this.jobLifecycle;
    }

    public GetWorkspaceResponseBody setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetWorkspaceResponseBody setOssRoot(String ossRoot) {
        this.ossRoot = ossRoot;
        return this;
    }
    public String getOssRoot() {
        return this.ossRoot;
    }

    public GetWorkspaceResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetWorkspaceResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetWorkspaceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetWorkspaceResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetWorkspaceResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public GetWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkspaceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
