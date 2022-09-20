// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOpsChartResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryOpsChartResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOpsChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsChartResponseBody self = new QueryOpsChartResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOpsChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOpsChartResponseBody setData(java.util.List<QueryOpsChartResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOpsChartResponseBodyData> getData() {
        return this.data;
    }

    public QueryOpsChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOpsChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOpsChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOpsChartResponseBodyData extends TeaModel {
        @NameInMap("StatDate")
        public String statDate;

        @NameInMap("UsagePercent")
        public Double usagePercent;

        public static QueryOpsChartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOpsChartResponseBodyData self = new QueryOpsChartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOpsChartResponseBodyData setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

        public QueryOpsChartResponseBodyData setUsagePercent(Double usagePercent) {
            this.usagePercent = usagePercent;
            return this;
        }
        public Double getUsagePercent() {
            return this.usagePercent;
        }

    }

}
