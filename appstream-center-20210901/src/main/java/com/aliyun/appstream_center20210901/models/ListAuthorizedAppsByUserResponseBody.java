// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppsByUserResponseBody extends TeaModel {
    /**
     * <p>The list of applications authorized for the user. Each record corresponds to an application within an app instance group.</p>
     */
    @NameInMap("Apps")
    public java.util.List<ListAuthorizedAppsByUserResponseBodyApps> apps;

    /**
     * <p>The page number of the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of authorization records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuthorizedAppsByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppsByUserResponseBody self = new ListAuthorizedAppsByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppsByUserResponseBody setApps(java.util.List<ListAuthorizedAppsByUserResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAuthorizedAppsByUserResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListAuthorizedAppsByUserResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAppsByUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAppsByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedAppsByUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedAppsByUserResponseBodyApps extends TeaModel {
        /**
         * <p>The access URL of the application icon. This parameter is empty when the deployment details of the application cannot be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the app instance group to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the app instance group to which the application belongs. If the app instance group information cannot be obtained, the returned value is the same as the AppInstanceGroupId.</p>
         * 
         * <strong>example:</strong>
         * <p>Office applications</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The application name. If the deployment details of the application cannot be obtained, the returned value is the same as the AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>Office applications</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version. This parameter is empty when the deployment details of the application cannot be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The application version name. This parameter is empty when the deployment details of the application cannot be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial version</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        /**
         * <p>The number of users authorized to access the application in the app instance group to which the application belongs. This parameter is empty when the deployment details of the application cannot be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthorizedUserCount")
        public Integer authorizedUserCount;

        public static ListAuthorizedAppsByUserResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedAppsByUserResponseBodyApps self = new ListAuthorizedAppsByUserResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAuthorizedAppsByUserResponseBodyApps setAuthorizedUserCount(Integer authorizedUserCount) {
            this.authorizedUserCount = authorizedUserCount;
            return this;
        }
        public Integer getAuthorizedUserCount() {
            return this.authorizedUserCount;
        }

    }

}
