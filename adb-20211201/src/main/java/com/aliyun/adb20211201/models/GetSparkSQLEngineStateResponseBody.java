// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkSQLEngineStateResponseBody extends TeaModel {
    /**
     * <p>The state information about the Spark SQL engine.</p>
     */
    @NameInMap("Data")
    public GetSparkSQLEngineStateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkSQLEngineStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSQLEngineStateResponseBody self = new GetSparkSQLEngineStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkSQLEngineStateResponseBody setData(GetSparkSQLEngineStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkSQLEngineStateResponseBodyData getData() {
        return this.data;
    }

    public GetSparkSQLEngineStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkSQLEngineStateResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202207151211hz0c****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The configuration of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The third-party JAR package.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test.jar</p>
         */
        @NameInMap("Jars")
        public String jars;

        /**
         * <p>The maximum number of started Spark executors.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxExecutor")
        public String maxExecutor;

        /**
         * <p>The minimum number of started Spark executors.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinExecutor")
        public String minExecutor;

        /**
         * <p>The slot number of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SlotNum")
        public String slotNum;

        /**
         * <p>The execution state of the application. Valid values:</p>
         * <ul>
         * <li>SUBMITTED</li>
         * <li>STARTING</li>
         * <li>RUNNING</li>
         * <li>FAILING</li>
         * <li>FAILED</li>
         * <li>KILLING</li>
         * <li>KILLED</li>
         * <li>SUCCEEDING</li>
         * <li>COMPLETED</li>
         * <li>FATAL</li>
         * <li>UNKNOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The timestamp when the Spark SQL application was submitted. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651213645000</p>
         */
        @NameInMap("SubmittedTimeInMillis")
        public String submittedTimeInMillis;

        public static GetSparkSQLEngineStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkSQLEngineStateResponseBodyData self = new GetSparkSQLEngineStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkSQLEngineStateResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkSQLEngineStateResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetSparkSQLEngineStateResponseBodyData setJars(String jars) {
            this.jars = jars;
            return this;
        }
        public String getJars() {
            return this.jars;
        }

        public GetSparkSQLEngineStateResponseBodyData setMaxExecutor(String maxExecutor) {
            this.maxExecutor = maxExecutor;
            return this;
        }
        public String getMaxExecutor() {
            return this.maxExecutor;
        }

        public GetSparkSQLEngineStateResponseBodyData setMinExecutor(String minExecutor) {
            this.minExecutor = minExecutor;
            return this;
        }
        public String getMinExecutor() {
            return this.minExecutor;
        }

        public GetSparkSQLEngineStateResponseBodyData setSlotNum(String slotNum) {
            this.slotNum = slotNum;
            return this;
        }
        public String getSlotNum() {
            return this.slotNum;
        }

        public GetSparkSQLEngineStateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSparkSQLEngineStateResponseBodyData setSubmittedTimeInMillis(String submittedTimeInMillis) {
            this.submittedTimeInMillis = submittedTimeInMillis;
            return this;
        }
        public String getSubmittedTimeInMillis() {
            return this.submittedTimeInMillis;
        }

    }

}
