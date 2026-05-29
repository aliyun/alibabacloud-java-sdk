// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QueryAutomaticWriteOffChangeRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAutomaticWriteOffChangeRecordsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8cd24f2917797624314748873d0096</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAutomaticWriteOffChangeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAutomaticWriteOffChangeRecordsResponseBody self = new QueryAutomaticWriteOffChangeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAutomaticWriteOffChangeRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAutomaticWriteOffChangeRecordsResponseBody setData(java.util.List<QueryAutomaticWriteOffChangeRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAutomaticWriteOffChangeRecordsResponseBodyData> getData() {
        return this.data;
    }

    public QueryAutomaticWriteOffChangeRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAutomaticWriteOffChangeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAutomaticWriteOffChangeRecordsResponseBodyData extends TeaModel {
        @NameInMap("ChangeContent")
        public String changeContent;

        /**
         * <strong>example:</strong>
         * <p>12312312</p>
         */
        @NameInMap("OperateId")
        public String operateId;

        /**
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("OperateSource")
        public String operateSource;

        /**
         * <strong>example:</strong>
         * <p>2023-12-15 10:34:36 UTC+8</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        public static QueryAutomaticWriteOffChangeRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAutomaticWriteOffChangeRecordsResponseBodyData self = new QueryAutomaticWriteOffChangeRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAutomaticWriteOffChangeRecordsResponseBodyData setChangeContent(String changeContent) {
            this.changeContent = changeContent;
            return this;
        }
        public String getChangeContent() {
            return this.changeContent;
        }

        public QueryAutomaticWriteOffChangeRecordsResponseBodyData setOperateId(String operateId) {
            this.operateId = operateId;
            return this;
        }
        public String getOperateId() {
            return this.operateId;
        }

        public QueryAutomaticWriteOffChangeRecordsResponseBodyData setOperateSource(String operateSource) {
            this.operateSource = operateSource;
            return this;
        }
        public String getOperateSource() {
            return this.operateSource;
        }

        public QueryAutomaticWriteOffChangeRecordsResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

    }

}
