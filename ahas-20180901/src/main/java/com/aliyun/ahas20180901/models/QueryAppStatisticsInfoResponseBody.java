// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppStatisticsInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppStatisticsInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppStatisticsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppStatisticsInfoResponseBody self = new QueryAppStatisticsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppStatisticsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppStatisticsInfoResponseBody setData(QueryAppStatisticsInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppStatisticsInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryAppStatisticsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppStatisticsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppStatisticsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppStatisticsInfoResponseBodyData extends TeaModel {
        @NameInMap("AppCount")
        public Long appCount;

        @NameInMap("AppCounts")
        public java.util.Map<String, ?> appCounts;

        @NameInMap("AppDeviceCount")
        public Long appDeviceCount;

        @NameInMap("AppDeviceCounts")
        public java.util.Map<String, ?> appDeviceCounts;

        public static QueryAppStatisticsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppStatisticsInfoResponseBodyData self = new QueryAppStatisticsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppStatisticsInfoResponseBodyData setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public QueryAppStatisticsInfoResponseBodyData setAppCounts(java.util.Map<String, ?> appCounts) {
            this.appCounts = appCounts;
            return this;
        }
        public java.util.Map<String, ?> getAppCounts() {
            return this.appCounts;
        }

        public QueryAppStatisticsInfoResponseBodyData setAppDeviceCount(Long appDeviceCount) {
            this.appDeviceCount = appDeviceCount;
            return this;
        }
        public Long getAppDeviceCount() {
            return this.appDeviceCount;
        }

        public QueryAppStatisticsInfoResponseBodyData setAppDeviceCounts(java.util.Map<String, ?> appDeviceCounts) {
            this.appDeviceCounts = appDeviceCounts;
            return this;
        }
        public java.util.Map<String, ?> getAppDeviceCounts() {
            return this.appDeviceCounts;
        }

    }

}
