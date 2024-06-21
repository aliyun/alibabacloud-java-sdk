// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CE3ABD2-1E04-561F-A9B4-0423D50****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The track data.</p>
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
         * <p>Indicates whether the request is sent from the client. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Client")
        public Boolean client;

        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>eir-server.properties</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The response latency. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The event. Valid values:</p>
         * <ul>
         * <li>pull: configuration acquisition events</li>
         * <li>persist: persistence events</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pull</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The name of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The logging time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28 15:09:15</p>
         */
        @NameInMap("LogDate")
        public String logDate;

        /**
         * <p>The MD5 value.</p>
         * 
         * <strong>example:</strong>
         * <p>d21c9091c60daa0ff7ee2f420141e5a0</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Indicates whether messages are pushed by a server. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Push")
        public Boolean push;

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.2</p>
         */
        @NameInMap("RequestIp")
        public String requestIp;

        /**
         * <p>The response node.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-1973b9a0-1670834*****-reg-center-0-2</p>
         */
        @NameInMap("ResponseIp")
        public String responseIp;

        /**
         * <p>The result.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The timestamp that indicates the time when the metric value is collected.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1659666529</p>
         */
        @NameInMap("Ts")
        public String ts;

        /**
         * <p>The release type. Valid values:</p>
         * <ul>
         * <li>beta: beta release</li>
         * <li>tag: canary release</li>
         * <li>batch: batch release</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>beta</p>
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
