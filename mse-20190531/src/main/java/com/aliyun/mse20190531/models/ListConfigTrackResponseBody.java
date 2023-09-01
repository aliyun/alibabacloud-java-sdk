// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The track data.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>httpCode</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The details of the data.</p>
     */
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
        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Client")
        public Boolean client;

        /**
         * <p>The name of the configuration group.</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The MD5 value.</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The result.</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The event. Valid values:</p>
         * <br>
         * <p>*   pull: configuration acquisition events</p>
         * <p>*   persist: persistence events</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The timestamp that indicates the time when the metric value is collected.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("LogDate")
        public String logDate;

        /**
         * <p>The release type. Valid values:</p>
         * <br>
         * <p>*   beta: beta release</p>
         * <p>*   tag: canary release</p>
         * <p>*   batch: batch release</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Indicates whether the request is sent from the client. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Push")
        public Boolean push;

        /**
         * <p>The response node.</p>
         */
        @NameInMap("RequestIp")
        public String requestIp;

        /**
         * <p>The ID of the configuration.</p>
         */
        @NameInMap("ResponseIp")
        public String responseIp;

        /**
         * <p>The response latency. Unit: milliseconds.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The source IP address of the request.</p>
         */
        @NameInMap("Ts")
        public String ts;

        /**
         * <p>Indicates whether messages are pushed by a server. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
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
