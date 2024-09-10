// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsResponseBody extends TeaModel {
    @NameInMap("GlobalApps")
    public java.util.List<ListGlobalAppsResponseBodyGlobalApps> globalApps;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>ba6d88e2-a6f2-4d2c-a2ae-68b76b078445</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("AppDefaultVersion")
        public String appDefaultVersion;

        /**
         * <strong>example:</strong>
         * <p>This is app description.</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <strong>example:</strong>
         * <p>实际使用时，计算该应用消耗的资源费用。</p>
         */
        @NameInMap("AppFee")
        public String appFee;

        /**
         * <strong>example:</strong>
         * <p>joint-calling</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>OpenAccess</p>
         */
        @NameInMap("AppScope")
        public String appScope;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <strong>example:</strong>
         * <p>yyyy/MM/dd HH:mm:ss</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Locations")
        public java.util.List<String> locations;

        /**
         * <strong>example:</strong>
         * <p>sentieon</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Pinned")
        public Boolean pinned;

        /**
         * <strong>example:</strong>
         * <p>Sentieon</p>
         */
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
