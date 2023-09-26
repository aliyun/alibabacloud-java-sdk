// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsForProviderResponseBody extends TeaModel {
    @NameInMap("Apps")
    public DescribeAppsForProviderResponseBodyApps apps;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppsForProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsForProviderResponseBody self = new DescribeAppsForProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsForProviderResponseBody setApps(DescribeAppsForProviderResponseBodyApps apps) {
        this.apps = apps;
        return this;
    }
    public DescribeAppsForProviderResponseBodyApps getApps() {
        return this.apps;
    }

    public DescribeAppsForProviderResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsForProviderResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsForProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsForProviderResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsForProviderResponseBodyAppsApp extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeAppsForProviderResponseBodyAppsApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsForProviderResponseBodyAppsApp self = new DescribeAppsForProviderResponseBodyAppsApp();
            return TeaModel.build(map, self);
        }

        public DescribeAppsForProviderResponseBodyAppsApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppsForProviderResponseBodyAppsApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsForProviderResponseBodyAppsApp setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppsForProviderResponseBodyAppsApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsForProviderResponseBodyAppsApp setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class DescribeAppsForProviderResponseBodyApps extends TeaModel {
        @NameInMap("App")
        public java.util.List<DescribeAppsForProviderResponseBodyAppsApp> app;

        public static DescribeAppsForProviderResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsForProviderResponseBodyApps self = new DescribeAppsForProviderResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public DescribeAppsForProviderResponseBodyApps setApp(java.util.List<DescribeAppsForProviderResponseBodyAppsApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<DescribeAppsForProviderResponseBodyAppsApp> getApp() {
            return this.app;
        }

    }

}
