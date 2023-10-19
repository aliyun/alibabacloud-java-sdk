// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZkTrackResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The track data.</p>
     */
    @NameInMap("Traces")
    public java.util.List<ListZkTrackResponseBodyTraces> traces;

    public static ListZkTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZkTrackResponseBody self = new ListZkTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZkTrackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListZkTrackResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListZkTrackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListZkTrackResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListZkTrackResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListZkTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListZkTrackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListZkTrackResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListZkTrackResponseBody setTraces(java.util.List<ListZkTrackResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<ListZkTrackResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class ListZkTrackResponseBodyTraces extends TeaModel {
        /**
         * <p>The access control list (ACL).</p>
         */
        @NameInMap("Acl")
        public String acl;

        /**
         * <p>The data type. Valid values:</p>
         * <br>
         * <p>*   persist</p>
         * <p>*   ephemeral</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The type of the event. For trajectory of the Notify type:</p>
         * <br>
         * <p>*   NodeCreated</p>
         * <p>*   NodeDeleted</p>
         * <p>*   NodeDataChanged</p>
         * <p>*   NodeChildrenChanged</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>Indicates whether the transaction ended.</p>
         */
        @NameInMap("Finished")
        public Boolean finished;

        /**
         * <p>The logging time.</p>
         */
        @NameInMap("LogDate")
        public String logDate;

        /**
         * <p>The transaction size.</p>
         */
        @NameInMap("MultiSize")
        public Long multiSize;

        /**
         * <p>The type of the operation. For trajectory of the Push type:</p>
         * <br>
         * <p>*   Create</p>
         * <p>*   Update</p>
         * <p>*   Delete</p>
         * <p>*   SetAcl</p>
         * <p>*   Multi</p>
         * <br>
         * <p>For trajectory of the Pull type:</p>
         * <br>
         * <p>*   GetData</p>
         * <p>*   GetChild</p>
         * <p>*   GetStat</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The session ID.</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The timestamp. It is not available.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The type of the trajectory. Valid values:</p>
         * <br>
         * <p>*   Push</p>
         * <p>*   Pull</p>
         * <p>*   Notify</p>
         */
        @NameInMap("TraceType")
        public String traceType;

        /**
         * <p>The time to live (TTL).</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
         * <p>Indicates whether the monitoring feature is enabled.</p>
         */
        @NameInMap("Watch")
        public Boolean watch;

        public static ListZkTrackResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            ListZkTrackResponseBodyTraces self = new ListZkTrackResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public ListZkTrackResponseBodyTraces setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public ListZkTrackResponseBodyTraces setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListZkTrackResponseBodyTraces setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListZkTrackResponseBodyTraces setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public ListZkTrackResponseBodyTraces setLogDate(String logDate) {
            this.logDate = logDate;
            return this;
        }
        public String getLogDate() {
            return this.logDate;
        }

        public ListZkTrackResponseBodyTraces setMultiSize(Long multiSize) {
            this.multiSize = multiSize;
            return this;
        }
        public Long getMultiSize() {
            return this.multiSize;
        }

        public ListZkTrackResponseBodyTraces setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public ListZkTrackResponseBodyTraces setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListZkTrackResponseBodyTraces setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListZkTrackResponseBodyTraces setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListZkTrackResponseBodyTraces setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListZkTrackResponseBodyTraces setTraceType(String traceType) {
            this.traceType = traceType;
            return this;
        }
        public String getTraceType() {
            return this.traceType;
        }

        public ListZkTrackResponseBodyTraces setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public ListZkTrackResponseBodyTraces setWatch(Boolean watch) {
            this.watch = watch;
            return this;
        }
        public Boolean getWatch() {
            return this.watch;
        }

    }

}
