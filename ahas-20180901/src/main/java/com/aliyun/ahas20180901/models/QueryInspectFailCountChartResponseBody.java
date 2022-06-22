// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectFailCountChartResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryInspectFailCountChartResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInspectFailCountChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectFailCountChartResponseBody self = new QueryInspectFailCountChartResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspectFailCountChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInspectFailCountChartResponseBody setData(java.util.List<QueryInspectFailCountChartResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryInspectFailCountChartResponseBodyData> getData() {
        return this.data;
    }

    public QueryInspectFailCountChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInspectFailCountChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspectFailCountChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInspectFailCountChartResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Date")
        public String date;

        @NameInMap("Title")
        public String title;

        public static QueryInspectFailCountChartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectFailCountChartResponseBodyData self = new QueryInspectFailCountChartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInspectFailCountChartResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryInspectFailCountChartResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryInspectFailCountChartResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
