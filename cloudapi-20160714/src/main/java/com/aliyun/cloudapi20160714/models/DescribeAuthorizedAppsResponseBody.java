// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedAppsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AuthorizedApps")
    public DescribeAuthorizedAppsResponseBodyAuthorizedApps authorizedApps;

    public static DescribeAuthorizedAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedAppsResponseBody self = new DescribeAuthorizedAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuthorizedAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthorizedAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthorizedAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAuthorizedAppsResponseBody setAuthorizedApps(DescribeAuthorizedAppsResponseBodyAuthorizedApps authorizedApps) {
        this.authorizedApps = authorizedApps;
        return this;
    }
    public DescribeAuthorizedAppsResponseBodyAuthorizedApps getAuthorizedApps() {
        return this.authorizedApps;
    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("AuthorizedTime")
        public String authorizedTime;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Operator")
        public String operator;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp self = new DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthVaildTime(String authVaildTime) {
            this.authVaildTime = authVaildTime;
            return this;
        }
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthorizedTime(String authorizedTime) {
            this.authorizedTime = authorizedTime;
            return this;
        }
        public String getAuthorizedTime() {
            return this.authorizedTime;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedApps extends TeaModel {
        @NameInMap("AuthorizedApp")
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedApps self = new DescribeAuthorizedAppsResponseBodyAuthorizedApps();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedApps setAuthorizedApp(java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp) {
            this.authorizedApp = authorizedApp;
            return this;
        }
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> getAuthorizedApp() {
            return this.authorizedApp;
        }

    }

}
