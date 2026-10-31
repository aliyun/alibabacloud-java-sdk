// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagerLogsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of log files for the specified TaskManager.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListStreamTaskManagerLogsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
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

    public static ListStreamTaskManagerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamTaskManagerLogsResponseBody self = new ListStreamTaskManagerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamTaskManagerLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStreamTaskManagerLogsResponseBody setData(java.util.List<ListStreamTaskManagerLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStreamTaskManagerLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListStreamTaskManagerLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStreamTaskManagerLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStreamTaskManagerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamTaskManagerLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStreamTaskManagerLogsResponseBodyData extends TeaModel {
        /**
         * <p>The log file name. This name can be used as the logName input parameter for the logContent operation.</p>
         * 
         * <strong>example:</strong>
         * <p>flink--standalonesession-0-dataphin-session-7db678957dc449aab0086b931c9f8218-jobmanager.log</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The last modified time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792033500000</p>
         */
        @NameInMap("Mtime")
        public Long mtime;

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListStreamTaskManagerLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStreamTaskManagerLogsResponseBodyData self = new ListStreamTaskManagerLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStreamTaskManagerLogsResponseBodyData setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public ListStreamTaskManagerLogsResponseBodyData setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListStreamTaskManagerLogsResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
