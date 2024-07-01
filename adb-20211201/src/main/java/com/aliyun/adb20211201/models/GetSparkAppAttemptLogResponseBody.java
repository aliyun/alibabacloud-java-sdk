// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppAttemptLogResponseBody extends TeaModel {
    /**
     * <p>The queried log.</p>
     */
    @NameInMap("Data")
    public GetSparkAppAttemptLogResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3A9594F-1D40-4472-A96C-8FB8AA20D38C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppAttemptLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppAttemptLogResponseBody self = new GetSparkAppAttemptLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppAttemptLogResponseBody setData(GetSparkAppAttemptLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppAttemptLogResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppAttemptLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppAttemptLogResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s202204132018hzprec1ac61a000****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
         * <p>22/04/22 15:30:49 INFO Utils: Start the dump task because s202207151211hz****-0001 app end, the interval is 238141ms;22/04/22 15:30:49 INFO AbstractConnector: Stopped Spark@5e774d9d{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>The number of log entries. A value of 0 indicates that no valid logs are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>775946240</p>
         */
        @NameInMap("LogSize")
        public Integer logSize;

        /**
         * <p>The alert message returned for the request, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>WARNING: log file maybe deleted, please check oss path: oss://TestBucketName/applog/</p>
         */
        @NameInMap("Message")
        public String message;

        public static GetSparkAppAttemptLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppAttemptLogResponseBodyData self = new GetSparkAppAttemptLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppAttemptLogResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkAppAttemptLogResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppAttemptLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetSparkAppAttemptLogResponseBodyData setLogSize(Integer logSize) {
            this.logSize = logSize;
            return this;
        }
        public Integer getLogSize() {
            return this.logSize;
        }

        public GetSparkAppAttemptLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
