// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppsResponseBody extends TeaModel {
    /**
     * <p>The list of application records on the current page. Each record corresponds to a deployed application in a published delivery group. The list is sorted by the creation time of the delivery group in descending order. An empty list is returned if no results match or the requested page exceeds the result range.</p>
     */
    @NameInMap("Apps")
    public java.util.List<ListPublishedAppsResponseBodyApps> apps;

    /**
     * <p>The page number specified in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page specified in this request. This value does not represent the actual number of records returned on the current page. The actual number may be less than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match all filter conditions. Records are counted on a per-delivery-group-plus-application basis. If the same application appears in multiple published delivery groups, each combination is counted separately. This value does not represent the number of records returned on the current page. The value is <code>0</code> if no results match.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublishedAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppsResponseBody self = new ListPublishedAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppsResponseBody setApps(java.util.List<ListPublishedAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListPublishedAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListPublishedAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishedAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublishedAppsResponseBodyApps extends TeaModel {
        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        /**
         * <p>The application ID. Pass this value together with <code>AppInstanceGroupId</code> when you invoke the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize users for this application.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the published delivery group to which this application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the published delivery group to which this application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApps</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApps</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The application version name, which is the name assigned to this version when the application was published.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial version</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        /**
         * <p>The number of users authorized by application for this application within its delivery group. Only users authorized through <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> by application are counted. The value is <code>0</code> if no users have been authorized by application.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AuthorizedUserCount")
        public Integer authorizedUserCount;

        public static ListPublishedAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAppsResponseBodyApps self = new ListPublishedAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListPublishedAppsResponseBodyApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListPublishedAppsResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishedAppsResponseBodyApps setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListPublishedAppsResponseBodyApps setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public ListPublishedAppsResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListPublishedAppsResponseBodyApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListPublishedAppsResponseBodyApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListPublishedAppsResponseBodyApps setAuthorizedUserCount(Integer authorizedUserCount) {
            this.authorizedUserCount = authorizedUserCount;
            return this;
        }
        public Integer getAuthorizedUserCount() {
            return this.authorizedUserCount;
        }

    }

}
