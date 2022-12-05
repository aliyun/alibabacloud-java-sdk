// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppConfig")
        public java.util.Map<String, String> appConfig;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

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
        @NameInMap("AppList")
        public java.util.List<ListMessageAppResponseBodyResultAppList> appList;

        @NameInMap("HasMore")
        public Boolean hasMore;

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
