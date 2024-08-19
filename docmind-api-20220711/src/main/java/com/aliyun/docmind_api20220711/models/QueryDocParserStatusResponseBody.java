// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class QueryDocParserStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDocParserStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDocParserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDocParserStatusResponseBody self = new QueryDocParserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDocParserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDocParserStatusResponseBody setData(QueryDocParserStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDocParserStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDocParserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDocParserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDocParserStatusResponseBodyData extends TeaModel {
        @NameInMap("NumberOfSuccessfulParsing")
        public Integer numberOfSuccessfulParsing;

        @NameInMap("Status")
        public String status;

        public static QueryDocParserStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDocParserStatusResponseBodyData self = new QueryDocParserStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDocParserStatusResponseBodyData setNumberOfSuccessfulParsing(Integer numberOfSuccessfulParsing) {
            this.numberOfSuccessfulParsing = numberOfSuccessfulParsing;
            return this;
        }
        public Integer getNumberOfSuccessfulParsing() {
            return this.numberOfSuccessfulParsing;
        }

        public QueryDocParserStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
