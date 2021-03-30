// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListProjectAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListProjectAppsResponseBodyResult result;

    public static ListProjectAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAppsResponseBody self = new ListProjectAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectAppsResponseBody setResult(ListProjectAppsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListProjectAppsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListProjectAppsResponseBodyResultProjectApps extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("AppPkgName")
        public String appPkgName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("OsType")
        public Integer osType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        public static ListProjectAppsResponseBodyResultProjectApps build(java.util.Map<String, ?> map) throws Exception {
            ListProjectAppsResponseBodyResultProjectApps self = new ListProjectAppsResponseBodyResultProjectApps();
            return TeaModel.build(map, self);
        }

        public ListProjectAppsResponseBodyResultProjectApps setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListProjectAppsResponseBodyResultProjectApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectAppsResponseBodyResultProjectApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListProjectAppsResponseBodyResultProjectApps setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectAppsResponseBodyResultProjectApps setAppPkgName(String appPkgName) {
            this.appPkgName = appPkgName;
            return this;
        }
        public String getAppPkgName() {
            return this.appPkgName;
        }

        public ListProjectAppsResponseBodyResultProjectApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListProjectAppsResponseBodyResultProjectApps setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public ListProjectAppsResponseBodyResultProjectApps setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListProjectAppsResponseBodyResultProjectApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListProjectAppsResponseBodyResultProjectApps setOsType(Integer osType) {
            this.osType = osType;
            return this;
        }
        public Integer getOsType() {
            return this.osType;
        }

        public ListProjectAppsResponseBodyResultProjectApps setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectAppsResponseBodyResultProjectApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListProjectAppsResponseBodyResult extends TeaModel {
        @NameInMap("ProjectApps")
        public java.util.List<ListProjectAppsResponseBodyResultProjectApps> projectApps;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectAppsResponseBodyResult self = new ListProjectAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListProjectAppsResponseBodyResult setProjectApps(java.util.List<ListProjectAppsResponseBodyResultProjectApps> projectApps) {
            this.projectApps = projectApps;
            return this;
        }
        public java.util.List<ListProjectAppsResponseBodyResultProjectApps> getProjectApps() {
            return this.projectApps;
        }

        public ListProjectAppsResponseBodyResult setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListProjectAppsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
