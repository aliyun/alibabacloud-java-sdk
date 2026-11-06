// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserAppUsageAggregateByHourResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates that the request is successful. Other values indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of hourly aggregated user application usage data. A maximum of five records are returned for each hour.</p>
     */
    @NameInMap("IndexData")
    public java.util.List<QueryUserAppUsageAggregateByHourResponseBodyIndexData> indexData;

    /**
     * <p>The description of the request processing result. A value of success is usually returned when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryUserAppUsageAggregateByHourResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAppUsageAggregateByHourResponseBody self = new QueryUserAppUsageAggregateByHourResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserAppUsageAggregateByHourResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserAppUsageAggregateByHourResponseBody setIndexData(java.util.List<QueryUserAppUsageAggregateByHourResponseBodyIndexData> indexData) {
        this.indexData = indexData;
        return this;
    }
    public java.util.List<QueryUserAppUsageAggregateByHourResponseBodyIndexData> getIndexData() {
        return this.indexData;
    }

    public QueryUserAppUsageAggregateByHourResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserAppUsageAggregateByHourResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUserAppUsageAggregateByHourResponseBodyIndexData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Visual Studio Code</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The cumulative usage duration of the application within the statistical range. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AppTimeCnt")
        public String appTimeCnt;

        /**
         * <p>The statistical hour in a two-digit 24-hour format string. Valid values: 00 to 23. Hour boundaries are divided based on the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("Hh")
        public String hh;

        public static QueryUserAppUsageAggregateByHourResponseBodyIndexData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserAppUsageAggregateByHourResponseBodyIndexData self = new QueryUserAppUsageAggregateByHourResponseBodyIndexData();
            return TeaModel.build(map, self);
        }

        public QueryUserAppUsageAggregateByHourResponseBodyIndexData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryUserAppUsageAggregateByHourResponseBodyIndexData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryUserAppUsageAggregateByHourResponseBodyIndexData setAppTimeCnt(String appTimeCnt) {
            this.appTimeCnt = appTimeCnt;
            return this;
        }
        public String getAppTimeCnt() {
            return this.appTimeCnt;
        }

        public QueryUserAppUsageAggregateByHourResponseBodyIndexData setHh(String hh) {
            this.hh = hh;
            return this;
        }
        public String getHh() {
            return this.hh;
        }

    }

}
