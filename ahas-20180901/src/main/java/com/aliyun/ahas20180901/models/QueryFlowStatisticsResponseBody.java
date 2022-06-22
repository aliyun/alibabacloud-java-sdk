// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryFlowStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryFlowStatisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFlowStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowStatisticsResponseBody self = new QueryFlowStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFlowStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFlowStatisticsResponseBody setData(QueryFlowStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFlowStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryFlowStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFlowStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFlowStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFlowStatisticsResponseBodyDataQps extends TeaModel {
        @NameInMap("Bqps")
        public Float bqps;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Pqps")
        public Float pqps;

        public static QueryFlowStatisticsResponseBodyDataQps build(java.util.Map<String, ?> map) throws Exception {
            QueryFlowStatisticsResponseBodyDataQps self = new QueryFlowStatisticsResponseBodyDataQps();
            return TeaModel.build(map, self);
        }

        public QueryFlowStatisticsResponseBodyDataQps setBqps(Float bqps) {
            this.bqps = bqps;
            return this;
        }
        public Float getBqps() {
            return this.bqps;
        }

        public QueryFlowStatisticsResponseBodyDataQps setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public QueryFlowStatisticsResponseBodyDataQps setPqps(Float pqps) {
            this.pqps = pqps;
            return this;
        }
        public Float getPqps() {
            return this.pqps;
        }

    }

    public static class QueryFlowStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Bavg")
        public Float bavg;

        @NameInMap("Bmax")
        public Float bmax;

        @NameInMap("Bmin")
        public Float bmin;

        @NameInMap("Bvar")
        public Float bvar;

        @NameInMap("Pavg")
        public Float pavg;

        @NameInMap("Pmax")
        public Float pmax;

        @NameInMap("Pmin")
        public Float pmin;

        @NameInMap("Pvar")
        public Float pvar;

        @NameInMap("Qps")
        public java.util.List<QueryFlowStatisticsResponseBodyDataQps> qps;

        public static QueryFlowStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFlowStatisticsResponseBodyData self = new QueryFlowStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFlowStatisticsResponseBodyData setBavg(Float bavg) {
            this.bavg = bavg;
            return this;
        }
        public Float getBavg() {
            return this.bavg;
        }

        public QueryFlowStatisticsResponseBodyData setBmax(Float bmax) {
            this.bmax = bmax;
            return this;
        }
        public Float getBmax() {
            return this.bmax;
        }

        public QueryFlowStatisticsResponseBodyData setBmin(Float bmin) {
            this.bmin = bmin;
            return this;
        }
        public Float getBmin() {
            return this.bmin;
        }

        public QueryFlowStatisticsResponseBodyData setBvar(Float bvar) {
            this.bvar = bvar;
            return this;
        }
        public Float getBvar() {
            return this.bvar;
        }

        public QueryFlowStatisticsResponseBodyData setPavg(Float pavg) {
            this.pavg = pavg;
            return this;
        }
        public Float getPavg() {
            return this.pavg;
        }

        public QueryFlowStatisticsResponseBodyData setPmax(Float pmax) {
            this.pmax = pmax;
            return this;
        }
        public Float getPmax() {
            return this.pmax;
        }

        public QueryFlowStatisticsResponseBodyData setPmin(Float pmin) {
            this.pmin = pmin;
            return this;
        }
        public Float getPmin() {
            return this.pmin;
        }

        public QueryFlowStatisticsResponseBodyData setPvar(Float pvar) {
            this.pvar = pvar;
            return this;
        }
        public Float getPvar() {
            return this.pvar;
        }

        public QueryFlowStatisticsResponseBodyData setQps(java.util.List<QueryFlowStatisticsResponseBodyDataQps> qps) {
            this.qps = qps;
            return this;
        }
        public java.util.List<QueryFlowStatisticsResponseBodyDataQps> getQps() {
            return this.qps;
        }

    }

}
