// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppInstanceGroupByUserResponseBody extends TeaModel {
    /**
     * <p>The list of authorized delivery groups on the current page. This is an empty list if the user has no authorized delivery groups that match the conditions.</p>
     */
    @NameInMap("AppInstanceGroupModels")
    public java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels> appInstanceGroupModels;

    /**
     * <p>The current page number. This value is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of delivery groups returned per page. This value is the same as the PageSize request parameter.</p>
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
     * <p>The total number of authorized delivery groups that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuthorizedAppInstanceGroupByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppInstanceGroupByUserResponseBody self = new ListAuthorizedAppInstanceGroupByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppInstanceGroupByUserResponseBody setAppInstanceGroupModels(java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels> appInstanceGroupModels) {
        this.appInstanceGroupModels = appInstanceGroupModels;
        return this;
    }
    public java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels> getAppInstanceGroupModels() {
        return this.appInstanceGroupModels;
    }

    public ListAuthorizedAppInstanceGroupByUserResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAppInstanceGroupByUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAppInstanceGroupByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedAppInstanceGroupByUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps extends TeaModel {
        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        /**
         * <p>The application ID. Pass this value to the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation to obtain a connection ticket for the application.</p>
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
         * <p>Office App</p>
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
         * <p>Initial version</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        public static ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps self = new ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

    }

    public static class ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels extends TeaModel {
        /**
         * <p>The ID of the application image used by the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>img-8z4nztpaqvay4****</p>
         */
        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        /**
         * <p>The delivery group ID. You can pass this value to the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation to specify the delivery group to connect to.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The delivery group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Office App</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The specification type of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>dynamic</strong></p>
         */
        @NameInMap("AppInstanceType")
        public String appInstanceType;

        /**
         * <p>The list of applications deployed in the delivery group. This list includes all deployed applications in the delivery group image and is not affected by the AppId or AppName request parameters.</p>
         */
        @NameInMap("Apps")
        public java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps> apps;

        /**
         * <p>The expiration time of the delivery group. The value is in the ISO 8601 datetime format with milliseconds and a time zone offset. The returned time zone offset is +00:00. Format: yyyy-MM-ddTHH:mm:ss.SSS+HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-27T16:00:00.000+00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The creation time of the delivery group. The value is in the ISO 8601 datetime format with milliseconds and a time zone offset. The returned time zone offset is +00:00. Format: yyyy-MM-ddTHH:mm:ss.SSS+HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T15:06:16.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The delivery group status. Valid values:</p>
         * <ul>
         * <li>DEPLOYING: The delivery group is being created or starting resources and is not yet connectable.</li>
         * <li>DEPLOYED: The delivery group is deployed. Resources are ready but the delivery group has not been listed for service.</li>
         * <li>PUBLISHED: The delivery group is published and listed. Users can connect to and use the delivery group.</li>
         * <li>STOPPING: The delivery group is being delisted and is stopping service.</li>
         * <li>STOPPED: The delivery group is delisted and has stopped service. Users cannot connect.</li>
         * <li>MAINTAINING: The delivery group is being maintained or updated.</li>
         * <li>FAILED: The delivery group failed to publish. Resource initialization failed.</li>
         * <li>MAINTAIN_FAILED: The update failed. Maintenance or changes were not successful.</li>
         * <li>DELETING: The delivery group is being deleted.</li>
         * </ul>
         * <blockquote>
         * <p>Deleted delivery groups are not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels self = new ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setAppCenterImageId(String appCenterImageId) {
            this.appCenterImageId = appCenterImageId;
            return this;
        }
        public String getAppCenterImageId() {
            return this.appCenterImageId;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setApps(java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModelsApps> getApps() {
            return this.apps;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAuthorizedAppInstanceGroupByUserResponseBodyAppInstanceGroupModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
