// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkSQLEngineResponseBody extends TeaModel {
    @NameInMap("Data")
    public StartSparkSQLEngineResponseBodyData data;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

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
