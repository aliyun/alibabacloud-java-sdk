// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSparkAppsResponseBodyData data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSparkAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppsResponseBody self = new ListSparkAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkAppsResponseBody setData(ListSparkAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkAppsResponseBodyData getData() {
        return this.data;
    }

    public ListSparkAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSparkAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSparkAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSparkAppsResponseBodyData extends TeaModel {
        @NameInMap("AppInfoList")
        public java.util.List<SparkAppInfo> appInfoList;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSparkAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkAppsResponseBodyData self = new ListSparkAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkAppsResponseBodyData setAppInfoList(java.util.List<SparkAppInfo> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }
        public java.util.List<SparkAppInfo> getAppInfoList() {
            return this.appInfoList;
        }

        public ListSparkAppsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkAppsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkAppsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
