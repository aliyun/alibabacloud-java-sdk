// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBatchRegistAnonymousTbAccountResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10418*******</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FailIds")
    public QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds failIds;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5E2D59BA-4EB0-45C4-A0D7-D98C1A4B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryBatchRegistAnonymousTbAccountResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegistAnonymousTbAccountResultResponseBody self = new QueryBatchRegistAnonymousTbAccountResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setFailIds(QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds failIds) {
        this.failIds = failIds;
        return this;
    }
    public QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds getFailIds() {
        return this.failIds;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds extends TeaModel {
        @NameInMap("FailId")
        public java.util.List<String> failId;

        public static QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds self = new QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegistAnonymousTbAccountResultResponseBodyFailIds setFailId(java.util.List<String> failId) {
            this.failId = failId;
            return this;
        }
        public java.util.List<String> getFailId() {
            return this.failId;
        }

    }

}
