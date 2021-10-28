// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsResponseBody extends TeaModel {
    // 公共应用集合
    @NameInMap("GlobalApps")
    public java.util.List<ListGlobalAppsResponseBodyGlobalApps> globalApps;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 本次请求条件下的数据总量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGlobalAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsResponseBody self = new ListGlobalAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalAppsResponseBody setGlobalApps(java.util.List<ListGlobalAppsResponseBodyGlobalApps> globalApps) {
        this.globalApps = globalApps;
        return this;
    }
    public java.util.List<ListGlobalAppsResponseBodyGlobalApps> getGlobalApps() {
        return this.globalApps;
    }

    public ListGlobalAppsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListGlobalAppsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGlobalAppsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGlobalAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGlobalAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGlobalAppsResponseBodyGlobalApps extends TeaModel {
        // 应用默认版本
        @NameInMap("AppDefaultVersion")
        public String appDefaultVersion;

        // 应用描述
        @NameInMap("AppDescription")
        public String appDescription;

        // 应用计费说明
        @NameInMap("AppFee")
        public String appFee;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 应用权限
        @NameInMap("AppScope")
        public String appScope;

        // 应用所属分类
        @NameInMap("Categories")
        public java.util.List<String> categories;

        // 更新时间
        @NameInMap("LastModified")
        public String lastModified;

        // 应用支持的区域ids
        @NameInMap("Locations")
        public java.util.List<String> locations;

        // 命名空间名称
        @NameInMap("NamespaceName")
        public String namespaceName;

        // 应用收藏置顶标记
        @NameInMap("Pinned")
        public Boolean pinned;

        // 应用工具合集
        @NameInMap("Toolkit")
        public String toolkit;

        public static ListGlobalAppsResponseBodyGlobalApps build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalAppsResponseBodyGlobalApps self = new ListGlobalAppsResponseBodyGlobalApps();
            return TeaModel.build(map, self);
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppDefaultVersion(String appDefaultVersion) {
            this.appDefaultVersion = appDefaultVersion;
            return this;
        }
        public String getAppDefaultVersion() {
            return this.appDefaultVersion;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppFee(String appFee) {
            this.appFee = appFee;
            return this;
        }
        public String getAppFee() {
            return this.appFee;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppScope(String appScope) {
            this.appScope = appScope;
            return this;
        }
        public String getAppScope() {
            return this.appScope;
        }

        public ListGlobalAppsResponseBodyGlobalApps setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListGlobalAppsResponseBodyGlobalApps setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListGlobalAppsResponseBodyGlobalApps setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        public ListGlobalAppsResponseBodyGlobalApps setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListGlobalAppsResponseBodyGlobalApps setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public ListGlobalAppsResponseBodyGlobalApps setToolkit(String toolkit) {
            this.toolkit = toolkit;
            return this;
        }
        public String getToolkit() {
            return this.toolkit;
        }

    }

}
