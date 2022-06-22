// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryClusterStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterStatisticsResponseBody self = new QueryClusterStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClusterStatisticsResponseBody setData(java.util.List<QueryClusterStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryClusterStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public QueryClusterStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterStatisticsResponseBodyData extends TeaModel {
        @NameInMap("BlockedQps")
        public Float blockedQps;

        @NameInMap("ExceptionQps")
        public Float exceptionQps;

        @NameInMap("PassedQps")
        public Float passedQps;

        @NameInMap("Ratio")
        public Float ratio;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("SuccessQps")
        public Float successQps;

        @NameInMap("Thread")
        public Float thread;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static QueryClusterStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterStatisticsResponseBodyData self = new QueryClusterStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterStatisticsResponseBodyData setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QueryClusterStatisticsResponseBodyData setExceptionQps(Float exceptionQps) {
            this.exceptionQps = exceptionQps;
            return this;
        }
        public Float getExceptionQps() {
            return this.exceptionQps;
        }

        public QueryClusterStatisticsResponseBodyData setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QueryClusterStatisticsResponseBodyData setRatio(Float ratio) {
            this.ratio = ratio;
            return this;
        }
        public Float getRatio() {
            return this.ratio;
        }

        public QueryClusterStatisticsResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QueryClusterStatisticsResponseBodyData setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public QueryClusterStatisticsResponseBodyData setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public QueryClusterStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
