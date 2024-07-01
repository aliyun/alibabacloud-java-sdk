// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppStateResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkAppStateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppStateResponseBody self = new GetSparkAppStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppStateResponseBody setData(GetSparkAppStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppStateResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppStateResponseBodyData extends TeaModel {
        /**
         * <p>The Spark application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s202204191546hzpread6a896000****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-clusterxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The alert message returned for the operation, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient resources.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The execution state of the application. Valid values:</p>
         * <ul>
         * <li><strong>SUBMITTED</strong></li>
         * <li><strong>STARTING</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FAILING</strong></li>
         * <li><strong>FAILED</strong></li>
         * <li><strong>KILLING</strong></li>
         * <li><strong>KILLED</strong></li>
         * <li><strong>SUCCEEDING</strong></li>
         * <li><strong>COMPLETED</strong></li>
         * <li><strong>FATAL</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("State")
        public String state;

        public static GetSparkAppStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppStateResponseBodyData self = new GetSparkAppStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppStateResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkAppStateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSparkAppStateResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppStateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSparkAppStateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
