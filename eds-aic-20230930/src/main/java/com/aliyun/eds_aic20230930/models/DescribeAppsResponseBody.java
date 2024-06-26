// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAppsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>CB95E410-FD1D-53C5-9F7D-93CC44D7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AndroidAppVersion")
        public String androidAppVersion;

        /**
         * <strong>example:</strong>
         * <p>10404</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <strong>example:</strong>
         * <p>testapp</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BizRegionId")
        public String bizRegionId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test.png">https://test.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>INSTALLING</p>
         */
        @NameInMap("InstallationStatus")
        public String installationStatus;

        @NameInMap("InstanceGroupList")
        public java.util.List<String> instanceGroupList;

        /**
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

        public DescribeAppsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
