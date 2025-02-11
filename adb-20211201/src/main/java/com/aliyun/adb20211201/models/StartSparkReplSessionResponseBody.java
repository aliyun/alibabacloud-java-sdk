// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkReplSessionResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public StartSparkReplSessionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1797FEA-B7D6-5ED6-A24B-2C8C5F4D7361</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartSparkReplSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSparkReplSessionResponseBody self = new StartSparkReplSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSparkReplSessionResponseBody setData(StartSparkReplSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartSparkReplSessionResponseBodyData getData() {
        return this.data;
    }

    public StartSparkReplSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartSparkReplSessionResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that owns the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>178157466******</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The attempt ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301061000h****</p>
         */
        @NameInMap("AttemptId")
        public String attemptId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>session time out</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the session that executes the code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <p>The status of the session. Valid values:</p>
         * <ul>
         * <li>IDLE</li>
         * <li>BUSY</li>
         * <li>DEAD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDLE</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The URL of the web UI for the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=">https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=</a>****</p>
         */
        @NameInMap("WebUiAddress")
        public String webUiAddress;

        public static StartSparkReplSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartSparkReplSessionResponseBodyData self = new StartSparkReplSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartSparkReplSessionResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public StartSparkReplSessionResponseBodyData setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public StartSparkReplSessionResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public StartSparkReplSessionResponseBodyData setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public StartSparkReplSessionResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public StartSparkReplSessionResponseBodyData setWebUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

    }

}
