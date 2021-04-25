// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 最大结果数
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RequestId")
    public String requestId;

    // 下次查询的起始Token
    @NameInMap("NextToken")
    public String nextToken;

    // 返回总个数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 工作空间数组
    @NameInMap("Workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        // 工作空间描述
        @NameInMap("Description")
        public String description;

        // 任务生命周期
        @NameInMap("JobLifecycle")
        public Integer jobLifecycle;

        // 工作空间标签
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        // OSS工作路径
        @NameInMap("OssRoot")
        public String ossRoot;

        // 工作空间Bucket名字
        @NameInMap("BucketName")
        public String bucketName;

        // RAM Role
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

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyWorkspaces setJobLifecycle(Integer jobLifecycle) {
            this.jobLifecycle = jobLifecycle;
            return this;
        }
        public Integer getJobLifecycle() {
            return this.jobLifecycle;
        }

        public ListWorkspacesResponseBodyWorkspaces setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListWorkspacesResponseBodyWorkspaces setOssRoot(String ossRoot) {
            this.ossRoot = ossRoot;
            return this;
        }
        public String getOssRoot() {
            return this.ossRoot;
        }

        public ListWorkspacesResponseBodyWorkspaces setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListWorkspacesResponseBodyWorkspaces setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListWorkspacesResponseBodyWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListWorkspacesResponseBodyWorkspaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
