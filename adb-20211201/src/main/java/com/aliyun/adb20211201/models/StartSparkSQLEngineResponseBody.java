// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkSQLEngineResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public StartSparkSQLEngineResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartSparkSQLEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSparkSQLEngineResponseBody self = new StartSparkSQLEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSparkSQLEngineResponseBody setData(StartSparkSQLEngineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartSparkSQLEngineResponseBodyData getData() {
        return this.data;
    }

    public StartSparkSQLEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartSparkSQLEngineResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>SQLEngine1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The state of the Spark SQL engine. Valid values:</p>
         * <ul>
         * <li>SUBMITTED</li>
         * <li>STARTING</li>
         * <li>RUNNING</li>
         * <li>FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("State")
        public String state;

        public static StartSparkSQLEngineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartSparkSQLEngineResponseBodyData self = new StartSparkSQLEngineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartSparkSQLEngineResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public StartSparkSQLEngineResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public StartSparkSQLEngineResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
