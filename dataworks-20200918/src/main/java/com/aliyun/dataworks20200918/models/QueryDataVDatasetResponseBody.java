// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class QueryDataVDatasetResponseBody extends TeaModel {
    @NameInMap("data")
    public QueryDataVDatasetResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    public static QueryDataVDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataVDatasetResponseBody self = new QueryDataVDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataVDatasetResponseBody setData(QueryDataVDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDataVDatasetResponseBodyData getData() {
        return this.data;
    }

    public QueryDataVDatasetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryDataVDatasetResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDataVDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDataVDatasetResponseBodyDataHeaders extends TeaModel {
        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("key")
        public String key;

        @NameInMap("type")
        public String type;

        public static QueryDataVDatasetResponseBodyDataHeaders build(java.util.Map<String, ?> map) throws Exception {
            QueryDataVDatasetResponseBodyDataHeaders self = new QueryDataVDatasetResponseBodyDataHeaders();
            return TeaModel.build(map, self);
        }

        public QueryDataVDatasetResponseBodyDataHeaders setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public QueryDataVDatasetResponseBodyDataHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDataVDatasetResponseBodyDataHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDataVDatasetResponseBodyData extends TeaModel {
        @NameInMap("body")
        public java.util.List<java.util.Map<String, ?>> body;

        @NameInMap("code")
        public String code;

        @NameInMap("count")
        public Integer count;

        @NameInMap("headers")
        public java.util.List<QueryDataVDatasetResponseBodyDataHeaders> headers;

        @NameInMap("msg")
        public String msg;

        @NameInMap("statusEnum")
        public String statusEnum;

        public static QueryDataVDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDataVDatasetResponseBodyData self = new QueryDataVDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDataVDatasetResponseBodyData setBody(java.util.List<java.util.Map<String, ?>> body) {
            this.body = body;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBody() {
            return this.body;
        }

        public QueryDataVDatasetResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryDataVDatasetResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryDataVDatasetResponseBodyData setHeaders(java.util.List<QueryDataVDatasetResponseBodyDataHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<QueryDataVDatasetResponseBodyDataHeaders> getHeaders() {
            return this.headers;
        }

        public QueryDataVDatasetResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryDataVDatasetResponseBodyData setStatusEnum(String statusEnum) {
            this.statusEnum = statusEnum;
            return this;
        }
        public String getStatusEnum() {
            return this.statusEnum;
        }

    }

}
