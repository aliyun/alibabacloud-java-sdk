// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("Apps")
    public DescribeAppsResponseBodyApps apps;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setApps(DescribeAppsResponseBodyApps apps) {
        this.apps = apps;
        return this;
    }
    public DescribeAppsResponseBodyApps getApps() {
        return this.apps;
    }

    public DescribeAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsResponseBodyAppsApp extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeAppsResponseBodyAppsApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppsApp self = new DescribeAppsResponseBodyAppsApp();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppsApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppsResponseBodyAppsApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyAppsApp setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeAppsResponseBodyAppsApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyAppsApp setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class DescribeAppsResponseBodyApps extends TeaModel {
        @NameInMap("App")
        public java.util.List<DescribeAppsResponseBodyAppsApp> app;

        public static DescribeAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyApps self = new DescribeAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyApps setApp(java.util.List<DescribeAppsResponseBodyAppsApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyAppsApp> getApp() {
            return this.app;
        }

    }

}
