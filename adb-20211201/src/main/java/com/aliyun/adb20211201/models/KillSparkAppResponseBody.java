// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkAppResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public KillSparkAppResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69D0810B-F9F5-5F4C-A57F-DF36133B63C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillSparkAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSparkAppResponseBody self = new KillSparkAppResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSparkAppResponseBody setData(KillSparkAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KillSparkAppResponseBodyData getData() {
        return this.data;
    }

    public KillSparkAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class KillSparkAppResponseBodyData extends TeaModel {
        /**
         * <p>The Spark application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s202204132018hzprec1ac****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>LAKEHOUSE-1-1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1c3em7b2e****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[Advisor] Advisor feature is not available for instance: am-2ze292w4fyglwxxxx</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The execution state of the Spark application. Valid values:</p>
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
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        public static KillSparkAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KillSparkAppResponseBodyData self = new KillSparkAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KillSparkAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public KillSparkAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public KillSparkAppResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public KillSparkAppResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public KillSparkAppResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
