// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Traces")
    public java.util.List<ListConfigTrackResponseBodyTraces> traces;

    public static ListConfigTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTrackResponseBody self = new ListConfigTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigTrackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListConfigTrackResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListConfigTrackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigTrackResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigTrackResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConfigTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigTrackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConfigTrackResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListConfigTrackResponseBody setTraces(java.util.List<ListConfigTrackResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<ListConfigTrackResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class ListConfigTrackResponseBodyTraces extends TeaModel {
        @NameInMap("Client")
        public Boolean client;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("Event")
        public String event;

        @NameInMap("Group")
        public String group;

        @NameInMap("LogDate")
        public String logDate;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Push")
        public Boolean push;

        @NameInMap("RequestIp")
        public String requestIp;

        @NameInMap("ResponseIp")
        public String responseIp;

        @NameInMap("Result")
        public String result;

        @NameInMap("Ts")
        public String ts;

        @NameInMap("Type")
        public String type;

        public static ListConfigTrackResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            ListConfigTrackResponseBodyTraces self = new ListConfigTrackResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public ListConfigTrackResponseBodyTraces setClient(Boolean client) {
            this.client = client;
            return this;
        }
        public Boolean getClient() {
            return this.client;
        }

        public ListConfigTrackResponseBodyTraces setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListConfigTrackResponseBodyTraces setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public ListConfigTrackResponseBodyTraces setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListConfigTrackResponseBodyTraces setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListConfigTrackResponseBodyTraces setLogDate(String logDate) {
            this.logDate = logDate;
            return this;
        }
        public String getLogDate() {
            return this.logDate;
        }

        public ListConfigTrackResponseBodyTraces setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListConfigTrackResponseBodyTraces setPush(Boolean push) {
            this.push = push;
            return this;
        }
        public Boolean getPush() {
            return this.push;
        }

        public ListConfigTrackResponseBodyTraces setRequestIp(String requestIp) {
            this.requestIp = requestIp;
            return this;
        }
        public String getRequestIp() {
            return this.requestIp;
        }

        public ListConfigTrackResponseBodyTraces setResponseIp(String responseIp) {
            this.responseIp = responseIp;
            return this;
        }
        public String getResponseIp() {
            return this.responseIp;
        }

        public ListConfigTrackResponseBodyTraces setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListConfigTrackResponseBodyTraces setTs(String ts) {
            this.ts = ts;
            return this;
        }
        public String getTs() {
            return this.ts;
        }

        public ListConfigTrackResponseBodyTraces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
