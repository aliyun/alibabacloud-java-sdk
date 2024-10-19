// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedAppsResponseBody extends TeaModel {
    /**
     * <p>The authorized applications.</p>
     */
    @NameInMap("AuthorizedApps")
    public DescribeAuthorizedAppsResponseBodyAuthorizedApps authorizedApps;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>D6E46F10-F26C-4AA0-BB69-FE2743D9AE62</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuthorizedAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedAppsResponseBody self = new DescribeAuthorizedAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedAppsResponseBody setAuthorizedApps(DescribeAuthorizedAppsResponseBodyAuthorizedApps authorizedApps) {
        this.authorizedApps = authorizedApps;
        return this;
    }
    public DescribeAuthorizedAppsResponseBodyAuthorizedApps getAuthorizedApps() {
        return this.authorizedApps;
    }

    public DescribeAuthorizedAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuthorizedAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthorizedAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthorizedAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo self = new DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo> tagInfo;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag self = new DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag setTagInfo(java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTagTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp extends TeaModel {
        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Production application</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The application ID, which is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>2386789</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weather</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-05T16:00:00Z</p>
         */
        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        /**
         * <p>The authorization source. Valid values:</p>
         * <ul>
         * <li><strong>CONSOLE</strong></li>
         * <li><strong>API</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        /**
         * <p>The authorization time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-21T06:17:20Z</p>
         */
        @NameInMap("AuthorizedTime")
        public String authorizedTime;

        /**
         * <p>The authorization description.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries weather based on the region name</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The authorizer. Valid values:</p>
         * <ul>
         * <li><strong>PROVIDER</strong>: API owner</li>
         * <li><strong>CONSUMER</strong>: API caller</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROVIDER</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Production</p>
         */
        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the staging environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Tag")
        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag tag;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp self = new DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthVaildTime(String authVaildTime) {
            this.authVaildTime = authVaildTime;
            return this;
        }
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setAuthorizedTime(String authorizedTime) {
            this.authorizedTime = authorizedTime;
            return this;
        }
        public String getAuthorizedTime() {
            return this.authorizedTime;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp setTag(DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag tag) {
            this.tag = tag;
            return this;
        }
        public DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedAppTag getTag() {
            return this.tag;
        }

    }

    public static class DescribeAuthorizedAppsResponseBodyAuthorizedApps extends TeaModel {
        @NameInMap("AuthorizedApp")
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp;

        public static DescribeAuthorizedAppsResponseBodyAuthorizedApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedAppsResponseBodyAuthorizedApps self = new DescribeAuthorizedAppsResponseBodyAuthorizedApps();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedAppsResponseBodyAuthorizedApps setAuthorizedApp(java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> authorizedApp) {
            this.authorizedApp = authorizedApp;
            return this;
        }
        public java.util.List<DescribeAuthorizedAppsResponseBodyAuthorizedAppsAuthorizedApp> getAuthorizedApp() {
            return this.authorizedApp;
        }

    }

}
