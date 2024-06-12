// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAppsResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AndroidAppVersion")
        public String androidAppVersion;

        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("InstallationStatus")
        public String installationStatus;

        @NameInMap("InstanceGroupList")
        public java.util.List<String> instanceGroupList;

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
