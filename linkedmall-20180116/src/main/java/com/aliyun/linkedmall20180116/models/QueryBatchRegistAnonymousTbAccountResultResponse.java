// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBatchRegistAnonymousTbAccountResultResponse extends TeaModel {
    @NameInMap("BatchId")
    @Validation(required = true)
    public String batchId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("FailIds")
    @Validation(required = true)
    public QueryBatchRegistAnonymousTbAccountResultResponseFailIds failIds;

    public static QueryBatchRegistAnonymousTbAccountResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegistAnonymousTbAccountResultResponse self = new QueryBatchRegistAnonymousTbAccountResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setFailIds(QueryBatchRegistAnonymousTbAccountResultResponseFailIds failIds) {
        this.failIds = failIds;
        return this;
    }
    public QueryBatchRegistAnonymousTbAccountResultResponseFailIds getFailIds() {
        return this.failIds;
    }

    public static class QueryBatchRegistAnonymousTbAccountResultResponseFailIds extends TeaModel {
        @NameInMap("FailId")
        @Validation(required = true)
        public java.util.List<String> failId;

        public static QueryBatchRegistAnonymousTbAccountResultResponseFailIds build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegistAnonymousTbAccountResultResponseFailIds self = new QueryBatchRegistAnonymousTbAccountResultResponseFailIds();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegistAnonymousTbAccountResultResponseFailIds setFailId(java.util.List<String> failId) {
            this.failId = failId;
            return this;
        }
        public java.util.List<String> getFailId() {
            return this.failId;
        }

    }

}
