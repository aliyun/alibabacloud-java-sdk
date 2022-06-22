// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AppProtectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppProtectionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AppProtectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppProtectionsResponseBody self = new AppProtectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public AppProtectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppProtectionsResponseBody setData(AppProtectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppProtectionsResponseBodyData getData() {
        return this.data;
    }

    public AppProtectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppProtectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AppProtectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AppProtectionsResponseBodyDataProtectStatistics extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Time")
        public Long time;

        public static AppProtectionsResponseBodyDataProtectStatistics build(java.util.Map<String, ?> map) throws Exception {
            AppProtectionsResponseBodyDataProtectStatistics self = new AppProtectionsResponseBodyDataProtectStatistics();
            return TeaModel.build(map, self);
        }

        public AppProtectionsResponseBodyDataProtectStatistics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AppProtectionsResponseBodyDataProtectStatistics setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class AppProtectionsResponseBodyData extends TeaModel {
        @NameInMap("AppCount")
        public Integer appCount;

        @NameInMap("AppQps")
        public java.util.Map<String, ?> appQps;

        @NameInMap("ProtectStatistics")
        public java.util.List<AppProtectionsResponseBodyDataProtectStatistics> protectStatistics;

        public static AppProtectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppProtectionsResponseBodyData self = new AppProtectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppProtectionsResponseBodyData setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public AppProtectionsResponseBodyData setAppQps(java.util.Map<String, ?> appQps) {
            this.appQps = appQps;
            return this;
        }
        public java.util.Map<String, ?> getAppQps() {
            return this.appQps;
        }

        public AppProtectionsResponseBodyData setProtectStatistics(java.util.List<AppProtectionsResponseBodyDataProtectStatistics> protectStatistics) {
            this.protectStatistics = protectStatistics;
            return this;
        }
        public java.util.List<AppProtectionsResponseBodyDataProtectStatistics> getProtectStatistics() {
            return this.protectStatistics;
        }

    }

    public static class QueryAppProtectionsResponseBodyDataProtectStatistics extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Time")
        public Long time;

        public static QueryAppProtectionsResponseBodyDataProtectStatistics build(java.util.Map<String, ?> map) throws Exception {
            QueryAppProtectionsResponseBodyDataProtectStatistics self = new QueryAppProtectionsResponseBodyDataProtectStatistics();
            return TeaModel.build(map, self);
        }

        public QueryAppProtectionsResponseBodyDataProtectStatistics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryAppProtectionsResponseBodyDataProtectStatistics setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class QueryAppProtectionsResponseBodyData extends TeaModel {
        @NameInMap("AppCount")
        public Integer appCount;

        @NameInMap("AppQps")
        public java.util.Map<String, ?> appQps;

        @NameInMap("ProtectStatistics")
        public java.util.List<QueryAppProtectionsResponseBodyDataProtectStatistics> protectStatistics;

        public static QueryAppProtectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppProtectionsResponseBodyData self = new QueryAppProtectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppProtectionsResponseBodyData setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public QueryAppProtectionsResponseBodyData setAppQps(java.util.Map<String, ?> appQps) {
            this.appQps = appQps;
            return this;
        }
        public java.util.Map<String, ?> getAppQps() {
            return this.appQps;
        }

        public QueryAppProtectionsResponseBodyData setProtectStatistics(java.util.List<QueryAppProtectionsResponseBodyDataProtectStatistics> protectStatistics) {
            this.protectStatistics = protectStatistics;
            return this;
        }
        public java.util.List<QueryAppProtectionsResponseBodyDataProtectStatistics> getProtectStatistics() {
            return this.protectStatistics;
        }

    }

}
