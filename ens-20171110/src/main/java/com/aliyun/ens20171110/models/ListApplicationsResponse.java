// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListApplicationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Applications")
    @Validation(required = true)
    public ListApplicationsResponseApplications applications;

    public static ListApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponse self = new ListApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListApplicationsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponse setApplications(ListApplicationsResponseApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseApplications getApplications() {
        return this.applications;
    }

    public static class ListApplicationsResponseApplicationsApplicationAppListApp extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppInfo")
        @Validation(required = true)
        public String appInfo;

        public static ListApplicationsResponseApplicationsApplicationAppListApp build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationAppListApp self = new ListApplicationsResponseApplicationsApplicationAppListApp();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationAppListApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseApplicationsApplicationAppListApp setAppInfo(String appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public String getAppInfo() {
            return this.appInfo;
        }

    }

    public static class ListApplicationsResponseApplicationsApplicationAppList extends TeaModel {
        @NameInMap("App")
        @Validation(required = true)
        public java.util.List<ListApplicationsResponseApplicationsApplicationAppListApp> app;

        public static ListApplicationsResponseApplicationsApplicationAppList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationAppList self = new ListApplicationsResponseApplicationsApplicationAppList();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationAppList setApp(java.util.List<ListApplicationsResponseApplicationsApplicationAppListApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<ListApplicationsResponseApplicationsApplicationAppListApp> getApp() {
            return this.app;
        }

    }

    public static class ListApplicationsResponseApplicationsApplication extends TeaModel {
        @NameInMap("ClusterName")
        @Validation(required = true)
        public String clusterName;

        @NameInMap("AppList")
        @Validation(required = true)
        public ListApplicationsResponseApplicationsApplicationAppList appList;

        public static ListApplicationsResponseApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplication self = new ListApplicationsResponseApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplication setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListApplicationsResponseApplicationsApplication setAppList(ListApplicationsResponseApplicationsApplicationAppList appList) {
            this.appList = appList;
            return this;
        }
        public ListApplicationsResponseApplicationsApplicationAppList getAppList() {
            return this.appList;
        }

    }

    public static class ListApplicationsResponseApplications extends TeaModel {
        @NameInMap("Application")
        @Validation(required = true)
        public java.util.List<ListApplicationsResponseApplicationsApplication> application;

        public static ListApplicationsResponseApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplications self = new ListApplicationsResponseApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplications setApplication(java.util.List<ListApplicationsResponseApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationsResponseApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
