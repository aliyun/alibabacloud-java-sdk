// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryJobStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>512FF8FD-A97F-4AAF-B0A2-7BE3D3A19BB3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryJobStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatisticsResponseBody self = new QueryJobStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJobStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobStatisticsResponseBody setData(QueryJobStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryJobStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryJobStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryJobStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryJobStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Cancelled")
        public Integer cancelled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("InProgress")
        public Integer inProgress;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Queued")
        public Integer queued;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rejected")
        public Integer rejected;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Sent")
        public Integer sent;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Succeeded")
        public Integer succeeded;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeOut")
        public Integer timeOut;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryJobStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryJobStatisticsResponseBodyData self = new QueryJobStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryJobStatisticsResponseBodyData setCancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }
        public Integer getCancelled() {
            return this.cancelled;
        }

        public QueryJobStatisticsResponseBodyData setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public QueryJobStatisticsResponseBodyData setInProgress(Integer inProgress) {
            this.inProgress = inProgress;
            return this;
        }
        public Integer getInProgress() {
            return this.inProgress;
        }

        public QueryJobStatisticsResponseBodyData setQueued(Integer queued) {
            this.queued = queued;
            return this;
        }
        public Integer getQueued() {
            return this.queued;
        }

        public QueryJobStatisticsResponseBodyData setRejected(Integer rejected) {
            this.rejected = rejected;
            return this;
        }
        public Integer getRejected() {
            return this.rejected;
        }

        public QueryJobStatisticsResponseBodyData setSent(Integer sent) {
            this.sent = sent;
            return this;
        }
        public Integer getSent() {
            return this.sent;
        }

        public QueryJobStatisticsResponseBodyData setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public QueryJobStatisticsResponseBodyData setTimeOut(Integer timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Integer getTimeOut() {
            return this.timeOut;
        }

        public QueryJobStatisticsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
