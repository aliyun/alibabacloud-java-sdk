// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryMessageAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryMessageAppResponseBodyResult> result;

    public static QueryMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageAppResponseBody self = new QueryMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageAppResponseBody setResult(java.util.List<QueryMessageAppResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryMessageAppResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryMessageAppResponseBodyResultAppList extends TeaModel {
        /**
         * <p>The configurations of the application.</p>
         */
        @NameInMap("AppConfig")
        public java.util.Map<String, String> appConfig;

        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the interactive messaging application was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>502280113</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The extended field.</p>
         */
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        /**
         * <p>The status of the interactive message application. A value of <strong>1</strong> indicates that the application is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static QueryMessageAppResponseBodyResultAppList build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageAppResponseBodyResultAppList self = new QueryMessageAppResponseBodyResultAppList();
            return TeaModel.build(map, self);
        }

        public QueryMessageAppResponseBodyResultAppList setAppConfig(java.util.Map<String, String> appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public java.util.Map<String, String> getAppConfig() {
            return this.appConfig;
        }

        public QueryMessageAppResponseBodyResultAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMessageAppResponseBodyResultAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMessageAppResponseBodyResultAppList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryMessageAppResponseBodyResultAppList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public QueryMessageAppResponseBodyResultAppList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryMessageAppResponseBodyResult extends TeaModel {
        /**
         * <p>Details about the interactive messaging applications.</p>
         */
        @NameInMap("AppList")
        public java.util.List<QueryMessageAppResponseBodyResultAppList> appList;

        /**
         * <p>Indicates whether the current page is followed by another page. Valid values:</p>
         * <ul>
         * <li>true: The current page is followed by another page.</li>
         * <li>false: The current page is not followed by another page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The total number of applications returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageAppResponseBodyResult self = new QueryMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMessageAppResponseBodyResult setAppList(java.util.List<QueryMessageAppResponseBodyResultAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<QueryMessageAppResponseBodyResultAppList> getAppList() {
            return this.appList;
        }

        public QueryMessageAppResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public QueryMessageAppResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
