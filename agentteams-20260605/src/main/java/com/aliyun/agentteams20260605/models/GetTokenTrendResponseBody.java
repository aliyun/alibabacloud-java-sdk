// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTokenTrendResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetTokenTrendResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public java.util.List<?> data;

        /**
         * <p>The series name.</p>
         * 
         * <strong>example:</strong>
         * <p>input_tokens</p>
         */
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
        /**
         * <p>The grouping dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("GroupBy")
        public String groupBy;

        /**
         * <p>The trend data series.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
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
