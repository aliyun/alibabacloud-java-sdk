// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZkTrackResponseBody extends TeaModel {
    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   true: The request was successful.
    // *   false: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    // The trajectory data.
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
        // The access control list (ACL).
        @NameInMap("Acl")
        public String acl;

        // The data type. Valid values:
        // 
        // *   persist
        // *   ephemeral
        @NameInMap("DataType")
        public String dataType;

        // The type of the event. For trajectory of the notify type:
        // 
        // *   NodeCreated
        // *   NodeDeleted
        // *   NodeDataChanged
        // *   NodeChildrenChanged
        @NameInMap("EventType")
        public String eventType;

        // Indicates whether the transaction ended.
        @NameInMap("Finished")
        public Boolean finished;

        // The recorded time.
        @NameInMap("LogDate")
        public String logDate;

        // The transaction size.
        @NameInMap("MultiSize")
        public Long multiSize;

        // The operation type. For trajectory of the push type:
        // 
        // *   Create
        // *   Update
        // *   Delete
        // *   SetAcl
        // *   Multi
        // 
        // For trajectory of the pull type:
        // 
        // *   GetData
        // *   GetChild
        // *   GetStat
        @NameInMap("OpType")
        public String opType;

        // The path.
        @NameInMap("Path")
        public String path;

        // The returned message.
        @NameInMap("Result")
        public String result;

        // The session ID.
        @NameInMap("SessionId")
        public String sessionId;

        // The timestamp (not available).
        @NameInMap("Timestamp")
        public String timestamp;

        // The type of the trajectory. Valid values:
        // 
        // *   Push
        // *   Pull
        // *   Notify
        @NameInMap("TraceType")
        public String traceType;

        // The time to live (TTL).
        @NameInMap("Ttl")
        public Long ttl;

        // Indicates whether to enable the listener.
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
