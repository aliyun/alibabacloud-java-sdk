// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    // 公共应用集合
    @NameInMap("GlobalApps")
    public java.util.List<ListGlobalAppsResponseBodyGlobalApps> globalApps;

    // 用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 本次请求条件下的数据总量
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("HostId")
    public String hostId;

    public static ListGlobalAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsResponseBody self = new ListGlobalAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGlobalAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGlobalAppsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListGlobalAppsResponseBody setGlobalApps(java.util.List<ListGlobalAppsResponseBodyGlobalApps> globalApps) {
        this.globalApps = globalApps;
        return this;
    }
    public java.util.List<ListGlobalAppsResponseBodyGlobalApps> getGlobalApps() {
        return this.globalApps;
    }

    public ListGlobalAppsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGlobalAppsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGlobalAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListGlobalAppsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListGlobalAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGlobalAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGlobalAppsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public static class ListGlobalAppsResponseBodyGlobalApps extends TeaModel {
        // 命名空间名称
        @NameInMap("NamespaceName")
        public String namespaceName;

        // 应用权限
        @NameInMap("AppScope")
        public String appScope;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 应用描述
        @NameInMap("AppDescription")
        public String appDescription;

        // 应用工具合集
        @NameInMap("Toolkit")
        public String toolkit;

        // 应用计费说明
        @NameInMap("AppFee")
        public String appFee;

        // 应用默认版本
        @NameInMap("AppDefaultVersion")
        public String appDefaultVersion;

        // 应用收藏置顶标记
        @NameInMap("Pinned")
        public Boolean pinned;

        // 更新时间
        @NameInMap("LastModified")
        public String lastModified;

        // 应用支持的区域ids
        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        // 应用所属分类
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static ListGlobalAppsResponseBodyGlobalApps build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalAppsResponseBodyGlobalApps self = new ListGlobalAppsResponseBodyGlobalApps();
            return TeaModel.build(map, self);
        }

        public ListGlobalAppsResponseBodyGlobalApps setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppScope(String appScope) {
            this.appScope = appScope;
            return this;
        }
        public String getAppScope() {
            return this.appScope;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListGlobalAppsResponseBodyGlobalApps setToolkit(String toolkit) {
            this.toolkit = toolkit;
            return this;
        }
        public String getToolkit() {
            return this.toolkit;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppFee(String appFee) {
            this.appFee = appFee;
            return this;
        }
        public String getAppFee() {
            return this.appFee;
        }

        public ListGlobalAppsResponseBodyGlobalApps setAppDefaultVersion(String appDefaultVersion) {
            this.appDefaultVersion = appDefaultVersion;
            return this;
        }
        public String getAppDefaultVersion() {
            return this.appDefaultVersion;
        }

        public ListGlobalAppsResponseBodyGlobalApps setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public ListGlobalAppsResponseBodyGlobalApps setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListGlobalAppsResponseBodyGlobalApps setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public ListGlobalAppsResponseBodyGlobalApps setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

}
