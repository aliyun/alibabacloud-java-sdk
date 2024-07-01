// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppLogResponseBody extends TeaModel {
    /**
     * <p>The queried log.</p>
     */
    @NameInMap("Data")
    public GetSparkAppLogResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3A9594F-1D40-4472-A96C-8FB8AA20D38C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppLogResponseBody self = new GetSparkAppLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppLogResponseBody setData(GetSparkAppLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppLogResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppLogResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-clusterxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>22/04/22 15:30:49 INFO Utils: Start the dump task because s202206061441hz22a35ab000****-0001 app end, the interval is 238141ms;22/04/22 15:30:49 INFO AbstractConnector: Stopped Spark@5e774d9d{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>The number of log entries. A value of 0 indicates that no valid logs are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3517972480</p>
         */
        @NameInMap("LogSize")
        public Integer logSize;

        /**
         * <p>The alert message returned for the request, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>WARNING:  log file maybe deleted, please check oss path: oss://TestBucketName/applog/</p>
         */
        @NameInMap("Message")
        public String message;

        public static GetSparkAppLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppLogResponseBodyData self = new GetSparkAppLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppLogResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetSparkAppLogResponseBodyData setLogSize(Integer logSize) {
            this.logSize = logSize;
            return this;
        }
        public Integer getLogSize() {
            return this.logSize;
        }

        public GetSparkAppLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
