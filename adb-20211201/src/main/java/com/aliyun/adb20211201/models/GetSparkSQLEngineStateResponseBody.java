// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkSQLEngineStateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkSQLEngineStateResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Config")
        public String config;

        @NameInMap("Jars")
        public String jars;

        @NameInMap("MaxExecutor")
        public String maxExecutor;

        @NameInMap("MinExecutor")
        public String minExecutor;

        @NameInMap("SlotNum")
        public String slotNum;

        @NameInMap("State")
        public String state;

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
