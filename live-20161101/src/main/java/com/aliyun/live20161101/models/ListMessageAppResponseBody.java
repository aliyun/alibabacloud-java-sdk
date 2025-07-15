// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageAppResponseBody extends TeaModel {
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
    public ListMessageAppResponseBodyResult result;

    public static ListMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAppResponseBody self = new ListMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageAppResponseBody setResult(ListMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMessageAppResponseBodyResultAppList extends TeaModel {
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

        public static ListMessageAppResponseBodyResultAppList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageAppResponseBodyResultAppList self = new ListMessageAppResponseBodyResultAppList();
            return TeaModel.build(map, self);
        }

        public ListMessageAppResponseBodyResultAppList setAppConfig(java.util.Map<String, String> appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public java.util.Map<String, String> getAppConfig() {
            return this.appConfig;
        }

        public ListMessageAppResponseBodyResultAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMessageAppResponseBodyResultAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMessageAppResponseBodyResultAppList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMessageAppResponseBodyResultAppList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListMessageAppResponseBodyResultAppList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListMessageAppResponseBodyResult extends TeaModel {
        /**
         * <p>Details about the applications.</p>
         */
        @NameInMap("AppList")
        public java.util.List<ListMessageAppResponseBodyResultAppList> appList;

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
         * <p>The total number of interactive message applications.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMessageAppResponseBodyResult self = new ListMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMessageAppResponseBodyResult setAppList(java.util.List<ListMessageAppResponseBodyResultAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<ListMessageAppResponseBodyResultAppList> getAppList() {
            return this.appList;
        }

        public ListMessageAppResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMessageAppResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
