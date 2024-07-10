// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryCopyrightExtractJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F24EAE86-5356-528E-A2B1-FEDE269F42DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryCopyrightExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractJobResponseBody self = new QueryCopyrightExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractJobResponseBody setData(QueryCopyrightExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCopyrightExtractJobResponseBodyData getData() {
        return this.data;
    }

    public QueryCopyrightExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCopyrightExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCopyrightExtractJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryCopyrightExtractJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example water mark</p>
         */
        @NameInMap("Message")
        public String message;

        public static QueryCopyrightExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightExtractJobResponseBodyData self = new QueryCopyrightExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightExtractJobResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
