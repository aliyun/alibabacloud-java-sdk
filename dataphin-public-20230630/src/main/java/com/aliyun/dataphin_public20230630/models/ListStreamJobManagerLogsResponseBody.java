// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamJobManagerLogsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The log file entries for JobManager or TaskManager. The logName parameter can be used to retrieve the log content.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListStreamJobManagerLogsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListStreamJobManagerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamJobManagerLogsResponseBody self = new ListStreamJobManagerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamJobManagerLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStreamJobManagerLogsResponseBody setData(java.util.List<ListStreamJobManagerLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStreamJobManagerLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListStreamJobManagerLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStreamJobManagerLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStreamJobManagerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamJobManagerLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStreamJobManagerLogsResponseBodyData extends TeaModel {
        /**
         * <p>The original name of the log file, which corresponds to the LogName input parameter of GetStreamLogContent. Pass this value exactly as returned.</p>
         * 
         * <strong>example:</strong>
         * <p>flink--standalonesession-0-dataphin-session-7db678957dc449aab0086b931c9f8218-jobmanager.log</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The last modified time of the log file, as a millisecond timestamp since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1792033500000</p>
         */
        @NameInMap("Mtime")
        public Long mtime;

        /**
         * <p>The size of the log file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListStreamJobManagerLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStreamJobManagerLogsResponseBodyData self = new ListStreamJobManagerLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStreamJobManagerLogsResponseBodyData setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public ListStreamJobManagerLogsResponseBodyData setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListStreamJobManagerLogsResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
