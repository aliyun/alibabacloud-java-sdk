// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListPublishedAppInfoResponseBody extends TeaModel {
    /**
     * <p>The list of published applications.</p>
     */
    @NameInMap("AppModels")
    public java.util.List<ListPublishedAppInfoResponseBodyAppModels> appModels;

    /**
     * <p>The starting token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>2NVfhLfgy5b3J5iJyoLQ6x4EULMg1hbhgB9NfnvdK9oj5zwxd17j4TuQkZze3RvhEvBinZYjknujF3Q1M</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB70F8FE-63A3-587B-8560-CEC258E8B944</p>
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
        /**
         * <p>The application image ID. You can obtain the ID from the Image Management page in the WUYING Cloud App console.</p>
         * 
         * <strong>example:</strong>
         * <p>img-f37nddbjc1lje14st</p>
         */
        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-fxwp4koyr5y2sp4mz</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Microsoft Word</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The theme color of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("AppThemeColor")
        public String appThemeColor;

        /**
         * <p>The application version number.</p>
         * 
         * <strong>example:</strong>
         * <p>R2021a</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The application version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        /**
         * <p>The authorization time of the application.
         * The return value is a serialized datetime string from the server in the format of <code>EEE MMM dd HH:mm:ss zzz yyyy</code>, which represents the day of the week, month, day, hour:minute:second, time zone abbreviation, and year in sequence. For example, <code>Wed Jan 14 20:47:02 CST 2026</code>, where <code>CST</code> is the time zone abbreviation of the server\&quot;s time zone (China Standard Time, UTC+08:00).</p>
         * 
         * <strong>example:</strong>
         * <p>Wed Jan 14 20:47:02 CST 2026</p>
         */
        @NameInMap("AuthTime")
        public String authTime;

        /**
         * <p>The specific category information of the application, which is the secondary category.
         * Valid values:</p>
         * <ul>
         * <li>1: All applications</li>
         * <li>2: Design software</li>
         * <li>3: Programming and development</li>
         * <li>4: Office essentials</li>
         * <li>5: Input methods</li>
         * <li>6: Image and video</li>
         * <li>7: System tools</li>
         * <li>8: Browsers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The primary category of the application. Valid values:</p>
         * <ul>
         * <li>0: Cloud application</li>
         * <li>1: Cloud game</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryType")
        public Long categoryType;

        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-streaming-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1973619010349344/1634523814270_Matlab.png">https://app-streaming-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1973619010349344/1634523814270_Matlab.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>Indicates whether the user has permissions.
         * The value is True.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsAuth")
        public Boolean isAuth;

        /**
         * <p>Indicates whether the application is in use.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
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
