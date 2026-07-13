// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTokenTrendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTokenTrendResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTokenTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenTrendResponseBody self = new GetTokenTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenTrendResponseBody setData(GetTokenTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenTrendResponseBodyData getData() {
        return this.data;
    }

    public GetTokenTrendResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTokenTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTokenTrendResponseBodyDataSeries extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        @NameInMap("Name")
        public String name;

        public static GetTokenTrendResponseBodyDataSeries build(java.util.Map<String, ?> map) throws Exception {
            GetTokenTrendResponseBodyDataSeries self = new GetTokenTrendResponseBodyDataSeries();
            return TeaModel.build(map, self);
        }

        public GetTokenTrendResponseBodyDataSeries setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

        public GetTokenTrendResponseBodyDataSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTokenTrendResponseBodyData extends TeaModel {
        @NameInMap("GroupBy")
        public String groupBy;

        @NameInMap("Series")
        public java.util.List<GetTokenTrendResponseBodyDataSeries> series;

        public static GetTokenTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenTrendResponseBodyData self = new GetTokenTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenTrendResponseBodyData setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public String getGroupBy() {
            return this.groupBy;
        }

        public GetTokenTrendResponseBodyData setSeries(java.util.List<GetTokenTrendResponseBodyDataSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<GetTokenTrendResponseBodyDataSeries> getSeries() {
            return this.series;
        }

    }

}
