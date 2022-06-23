// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<ListAppResponseBodyApps> apps;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponseBody self = new ListAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResponseBody setApps(java.util.List<ListAppResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAppResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppResponseBodyApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("VersionAdaptNum")
        public Long versionAdaptNum;

        @NameInMap("VersionTotalNum")
        public Long versionTotalNum;

        public static ListAppResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppResponseBodyApps self = new ListAppResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAppResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppResponseBodyApps setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppResponseBodyApps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppResponseBodyApps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppResponseBodyApps setVersionAdaptNum(Long versionAdaptNum) {
            this.versionAdaptNum = versionAdaptNum;
            return this;
        }
        public Long getVersionAdaptNum() {
            return this.versionAdaptNum;
        }

        public ListAppResponseBodyApps setVersionTotalNum(Long versionTotalNum) {
            this.versionTotalNum = versionTotalNum;
            return this;
        }
        public Long getVersionTotalNum() {
            return this.versionTotalNum;
        }

    }

}
