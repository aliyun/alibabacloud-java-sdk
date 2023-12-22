// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListPublishedAppInfoResponseBody extends TeaModel {
    /**
     * <p>appModels</p>
     */
    @NameInMap("AppModels")
    public java.util.List<ListPublishedAppInfoResponseBodyAppModels> appModels;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPublishedAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInfoResponseBody self = new ListPublishedAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInfoResponseBody setAppModels(java.util.List<ListPublishedAppInfoResponseBodyAppModels> appModels) {
        this.appModels = appModels;
        return this;
    }
    public java.util.List<ListPublishedAppInfoResponseBodyAppModels> getAppModels() {
        return this.appModels;
    }

    public ListPublishedAppInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublishedAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishedAppInfoResponseBodyAppModels extends TeaModel {
        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppThemeColor")
        public String appThemeColor;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AuthTime")
        public String authTime;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryType")
        public Long categoryType;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("IsAuth")
        public Boolean isAuth;

        @NameInMap("UsedInSession")
        public Boolean usedInSession;

        public static ListPublishedAppInfoResponseBodyAppModels build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAppInfoResponseBodyAppModels self = new ListPublishedAppInfoResponseBodyAppModels();
            return TeaModel.build(map, self);
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppCenterImageId(String appCenterImageId) {
            this.appCenterImageId = appCenterImageId;
            return this;
        }
        public String getAppCenterImageId() {
            return this.appCenterImageId;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppThemeColor(String appThemeColor) {
            this.appThemeColor = appThemeColor;
            return this;
        }
        public String getAppThemeColor() {
            return this.appThemeColor;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListPublishedAppInfoResponseBodyAppModels setAuthTime(String authTime) {
            this.authTime = authTime;
            return this;
        }
        public String getAuthTime() {
            return this.authTime;
        }

        public ListPublishedAppInfoResponseBodyAppModels setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListPublishedAppInfoResponseBodyAppModels setCategoryType(Long categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Long getCategoryType() {
            return this.categoryType;
        }

        public ListPublishedAppInfoResponseBodyAppModels setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListPublishedAppInfoResponseBodyAppModels setIsAuth(Boolean isAuth) {
            this.isAuth = isAuth;
            return this;
        }
        public Boolean getIsAuth() {
            return this.isAuth;
        }

        public ListPublishedAppInfoResponseBodyAppModels setUsedInSession(Boolean usedInSession) {
            this.usedInSession = usedInSession;
            return this;
        }
        public Boolean getUsedInSession() {
            return this.usedInSession;
        }

    }

}
