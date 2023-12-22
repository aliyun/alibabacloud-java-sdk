// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListLFUAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListLFUAppResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLFUAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLFUAppResponseBody self = new ListLFUAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLFUAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLFUAppResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListLFUAppResponseBody setData(java.util.List<ListLFUAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLFUAppResponseBodyData> getData() {
        return this.data;
    }

    public ListLFUAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLFUAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLFUAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLFUAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLFUAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("IsAuth")
        public Boolean isAuth;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("RequestId")
        public String requestId;

        public static ListLFUAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLFUAppResponseBodyData self = new ListLFUAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLFUAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLFUAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListLFUAppResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListLFUAppResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListLFUAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListLFUAppResponseBodyData setIsAuth(Boolean isAuth) {
            this.isAuth = isAuth;
            return this;
        }
        public Boolean getIsAuth() {
            return this.isAuth;
        }

        public ListLFUAppResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListLFUAppResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
