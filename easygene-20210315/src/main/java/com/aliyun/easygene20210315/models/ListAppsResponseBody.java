// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    // 应用数组
    @NameInMap("Apps")
    public java.util.List<ListAppsResponseBodyApps> apps;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 最大返回个数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // Next Token
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回个数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setApps(java.util.List<ListAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListAppsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListAppsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppsResponseBodyApps extends TeaModel {
        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 应用描述
        @NameInMap("Description")
        public String description;

        // 应用类型
        @NameInMap("AppType")
        public String appType;

        // 应用描述语言
        @NameInMap("Language")
        public String language;

        // 应用可见范围
        @NameInMap("Scope")
        public String scope;

        // 应用所在工作空间
        @NameInMap("Workspace")
        public String workspace;

        // 应用来源
        @NameInMap("Source")
        public String source;

        // 命名空间
        @NameInMap("Namespace")
        public String namespace;

        // 应用原名
        @NameInMap("AppOrigName")
        public String appOrigName;

        // 默认版本
        @NameInMap("AppDefaultVersion")
        public String appDefaultVersion;

        // 标签
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        public static ListAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyApps self = new ListAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyApps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppsResponseBodyApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppsResponseBodyApps setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppsResponseBodyApps setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAppsResponseBodyApps setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListAppsResponseBodyApps setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListAppsResponseBodyApps setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAppsResponseBodyApps setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAppsResponseBodyApps setAppOrigName(String appOrigName) {
            this.appOrigName = appOrigName;
            return this;
        }
        public String getAppOrigName() {
            return this.appOrigName;
        }

        public ListAppsResponseBodyApps setAppDefaultVersion(String appDefaultVersion) {
            this.appDefaultVersion = appDefaultVersion;
            return this;
        }
        public String getAppDefaultVersion() {
            return this.appDefaultVersion;
        }

        public ListAppsResponseBodyApps setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

    }

}
