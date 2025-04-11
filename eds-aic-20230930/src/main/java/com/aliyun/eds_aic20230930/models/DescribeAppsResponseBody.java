// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    /**
     * <p>The objects that are returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAppsResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB95E410-FD1D-53C5-9F7D-93CC44D7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setData(java.util.List<DescribeAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAppsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAppsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsResponseBodyData extends TeaModel {
        /**
         * <p>The version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AndroidAppVersion")
        public String androidAppVersion;

        /**
         * <p>Apk size.</p>
         * 
         * <strong>example:</strong>
         * <p>10244893</p>
         */
        @NameInMap("ApkSize")
        public String apkSize;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>10404</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>testapp</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        /**
         * <p>Region id.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>default description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the application was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The icon URL of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.png">https://test.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>The installation/uninstallation status of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>INSTALLFAILED: The application failed to be installed.</li>
         * <li>UNINSTALLING: The application is being uninstalled.</li>
         * <li>INSTALLING: The application is being installed.</li>
         * <li>UNINSTALLED: The application is uninstalled.</li>
         * <li>INSTALLED: The application is installed.</li>
         * <li>UNINSTALLFAILED: The application failed to be uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALLING</p>
         */
        @NameInMap("InstallationStatus")
        public String installationStatus;

        /**
         * <p>The list of instance groups where the application is installed.</p>
         */
        @NameInMap("InstanceGroupList")
        public java.util.List<String> instanceGroupList;

        /**
         * <p>The value of MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>THCIEH73KEK3334</p>
         */
        @NameInMap("MD5")
        public String MD5;

        /**
         * <p>The name of the application package.</p>
         * 
         * <strong>example:</strong>
         * <p>cn.rdstar.rdstarandroid</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The status of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED: The application failed to be created.</li>
         * <li>NORMAL: The application is available.</li>
         * <li>CREATING: The application is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyData self = new DescribeAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyData setAndroidAppVersion(String androidAppVersion) {
            this.androidAppVersion = androidAppVersion;
            return this;
        }
        public String getAndroidAppVersion() {
            return this.androidAppVersion;
        }

        public DescribeAppsResponseBodyData setApkSize(String apkSize) {
            this.apkSize = apkSize;
            return this;
        }
        public String getApkSize() {
            return this.apkSize;
        }

        public DescribeAppsResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public DescribeAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public DescribeAppsResponseBodyData setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public DescribeAppsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAppsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAppsResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public DescribeAppsResponseBodyData setInstallationStatus(String installationStatus) {
            this.installationStatus = installationStatus;
            return this;
        }
        public String getInstallationStatus() {
            return this.installationStatus;
        }

        public DescribeAppsResponseBodyData setInstanceGroupList(java.util.List<String> instanceGroupList) {
            this.instanceGroupList = instanceGroupList;
            return this;
        }
        public java.util.List<String> getInstanceGroupList() {
            return this.instanceGroupList;
        }

        public DescribeAppsResponseBodyData setMD5(String MD5) {
            this.MD5 = MD5;
            return this;
        }
        public String getMD5() {
            return this.MD5;
        }

        public DescribeAppsResponseBodyData setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeAppsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
