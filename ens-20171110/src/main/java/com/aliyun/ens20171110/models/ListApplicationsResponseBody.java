// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public ListApplicationsResponseBodyApplications applications;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(ListApplicationsResponseBodyApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseBodyApplications getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsResponseBodyApplicationsApplicationAppListApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppInfo")
        public String appInfo;

        public static ListApplicationsResponseBodyApplicationsApplicationAppListApp build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationAppListApp self = new ListApplicationsResponseBodyApplicationsApplicationAppListApp();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppListApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppListApp setAppInfo(String appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public String getAppInfo() {
            return this.appInfo;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplicationAppList extends TeaModel {
        @NameInMap("App")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> app;

        public static ListApplicationsResponseBodyApplicationsApplicationAppList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationAppList self = new ListApplicationsResponseBodyApplicationsApplicationAppList();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppList setApp(java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> getApp() {
            return this.app;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplication extends TeaModel {
        @NameInMap("AppList")
        public ListApplicationsResponseBodyApplicationsApplicationAppList appList;

        @NameInMap("ClusterName")
        public String clusterName;

        public static ListApplicationsResponseBodyApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplication self = new ListApplicationsResponseBodyApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppList(ListApplicationsResponseBodyApplicationsApplicationAppList appList) {
            this.appList = appList;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationAppList getAppList() {
            return this.appList;
        }

        public ListApplicationsResponseBodyApplicationsApplication setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> application;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplication(java.util.List<ListApplicationsResponseBodyApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
