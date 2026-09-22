// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppsByAppInstanceGroupIdResponseBody extends TeaModel {
    /**
     * <p>The list of application information on the current page. This is an empty list if no deployed applications exist in the delivery group image.</p>
     */
    @NameInMap("Apps")
    public java.util.List<ListAppsByAppInstanceGroupIdResponseBodyApps> apps;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of applications returned per page, which is the same as the PageSize request parameter.</p>
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
     * <p>The total number of deployed applications in the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppsByAppInstanceGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsByAppInstanceGroupIdResponseBody self = new ListAppsByAppInstanceGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsByAppInstanceGroupIdResponseBody setApps(java.util.List<ListAppsByAppInstanceGroupIdResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAppsByAppInstanceGroupIdResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListAppsByAppInstanceGroupIdResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppsByAppInstanceGroupIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppsByAppInstanceGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsByAppInstanceGroupIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppsByAppInstanceGroupIdResponseBodyApps extends TeaModel {
        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        /**
         * <p>The application ID. Pass in this value when you call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize users for this application.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApp</p>
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
         * <p>The application version name.</p>
         * 
         * <strong>example:</strong>
         * <p>InitialVersion</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        /**
         * <p>The number of users currently authorized by application for this application in the delivery group. The value 0 is returned if no users are authorized by application.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AuthorizedUserCount")
        public Integer authorizedUserCount;

        public static ListAppsByAppInstanceGroupIdResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppsByAppInstanceGroupIdResponseBodyApps self = new ListAppsByAppInstanceGroupIdResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppsByAppInstanceGroupIdResponseBodyApps setAuthorizedUserCount(Integer authorizedUserCount) {
            this.authorizedUserCount = authorizedUserCount;
            return this;
        }
        public Integer getAuthorizedUserCount() {
            return this.authorizedUserCount;
        }

    }

}
