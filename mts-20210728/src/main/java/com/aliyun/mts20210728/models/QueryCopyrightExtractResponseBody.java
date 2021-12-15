// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryCopyrightExtractResponseBodyData data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryCopyrightExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractResponseBody self = new QueryCopyrightExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractResponseBody setData(QueryCopyrightExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCopyrightExtractResponseBodyData getData() {
        return this.data;
    }

    public QueryCopyrightExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCopyrightExtractResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public QueryCopyrightExtractResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryCopyrightExtractResponseBodyData extends TeaModel {
        // 版权水印信息
        @NameInMap("Message")
        public String message;

        public static QueryCopyrightExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightExtractResponseBodyData self = new QueryCopyrightExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightExtractResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
