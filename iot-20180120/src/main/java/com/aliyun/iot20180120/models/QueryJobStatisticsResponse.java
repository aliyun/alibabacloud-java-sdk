// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryJobStatisticsResponseData data;

    public static QueryJobStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatisticsResponse self = new QueryJobStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobStatisticsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryJobStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobStatisticsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryJobStatisticsResponse setData(QueryJobStatisticsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryJobStatisticsResponseData getData() {
        return this.data;
    }

    public static class QueryJobStatisticsResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Queued")
        @Validation(required = true)
        public Integer queued;

        @NameInMap("Sent")
        @Validation(required = true)
        public Integer sent;

        @NameInMap("InProgress")
        @Validation(required = true)
        public Integer inProgress;

        @NameInMap("Succeeded")
        @Validation(required = true)
        public Integer succeeded;

        @NameInMap("Failed")
        @Validation(required = true)
        public Integer failed;

        @NameInMap("Rejected")
        @Validation(required = true)
        public Integer rejected;

        @NameInMap("TimeOut")
        @Validation(required = true)
        public Integer timeOut;

        @NameInMap("Cancelled")
        @Validation(required = true)
        public Integer cancelled;

        public static QueryJobStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryJobStatisticsResponseData self = new QueryJobStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryJobStatisticsResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryJobStatisticsResponseData setQueued(Integer queued) {
            this.queued = queued;
            return this;
        }
        public Integer getQueued() {
            return this.queued;
        }

        public QueryJobStatisticsResponseData setSent(Integer sent) {
            this.sent = sent;
            return this;
        }
        public Integer getSent() {
            return this.sent;
        }

        public QueryJobStatisticsResponseData setInProgress(Integer inProgress) {
            this.inProgress = inProgress;
            return this;
        }
        public Integer getInProgress() {
            return this.inProgress;
        }

        public QueryJobStatisticsResponseData setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public QueryJobStatisticsResponseData setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public QueryJobStatisticsResponseData setRejected(Integer rejected) {
            this.rejected = rejected;
            return this;
        }
        public Integer getRejected() {
            return this.rejected;
        }

        public QueryJobStatisticsResponseData setTimeOut(Integer timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Integer getTimeOut() {
            return this.timeOut;
        }

        public QueryJobStatisticsResponseData setCancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }
        public Integer getCancelled() {
            return this.cancelled;
        }

    }

}
