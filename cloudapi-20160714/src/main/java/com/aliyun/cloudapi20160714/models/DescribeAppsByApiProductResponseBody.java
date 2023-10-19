// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppsByApiProductResponseBody extends TeaModel {
    @NameInMap("AuthorizedApps")
    public DescribeAppsByApiProductResponseBodyAuthorizedApps authorizedApps;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppsByApiProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsByApiProductResponseBody self = new DescribeAppsByApiProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsByApiProductResponseBody setAuthorizedApps(DescribeAppsByApiProductResponseBodyAuthorizedApps authorizedApps) {
        this.authorizedApps = authorizedApps;
        return this;
    }
    public DescribeAppsByApiProductResponseBodyAuthorizedApps getAuthorizedApps() {
        return this.authorizedApps;
    }

    public DescribeAppsByApiProductResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsByApiProductResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsByApiProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsByApiProductResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AuthValidTime")
        public String authValidTime;

        @NameInMap("AuthorizedTime")
        public String authorizedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Extend")
        public String extend;

        public static DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp self = new DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp();
            return TeaModel.build(map, self);
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setAuthValidTime(String authValidTime) {
            this.authValidTime = authValidTime;
            return this;
        }
        public String getAuthValidTime() {
            return this.authValidTime;
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setAuthorizedTime(String authorizedTime) {
            this.authorizedTime = authorizedTime;
            return this;
        }
        public String getAuthorizedTime() {
            return this.authorizedTime;
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

    }

    public static class DescribeAppsByApiProductResponseBodyAuthorizedApps extends TeaModel {
        @NameInMap("AuthorizedApp")
        public java.util.List<DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp;

        public static DescribeAppsByApiProductResponseBodyAuthorizedApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsByApiProductResponseBodyAuthorizedApps self = new DescribeAppsByApiProductResponseBodyAuthorizedApps();
            return TeaModel.build(map, self);
        }

        public DescribeAppsByApiProductResponseBodyAuthorizedApps setAuthorizedApp(java.util.List<DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp) {
            this.authorizedApp = authorizedApp;
            return this;
        }
        public java.util.List<DescribeAppsByApiProductResponseBodyAuthorizedAppsAuthorizedApp> getAuthorizedApp() {
            return this.authorizedApp;
        }

    }

}
