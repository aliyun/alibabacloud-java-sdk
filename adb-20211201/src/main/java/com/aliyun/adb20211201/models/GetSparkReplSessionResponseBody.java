// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplSessionResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkReplSessionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE6DF97-AEA4-484F-906F-C407EE3770EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkReplSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplSessionResponseBody self = new GetSparkReplSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkReplSessionResponseBody setData(GetSparkReplSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkReplSessionResponseBodyData getData() {
        return this.data;
    }

    public GetSparkReplSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkReplSessionResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the session is active. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public String active;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>178157466101****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The attempt ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301061000hz57d797b00002****</p>
         */
        @NameInMap("AttemptId")
        public String attemptId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Session timed out</p>
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
         * <p>IDEL</p>
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

        public static GetSparkReplSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkReplSessionResponseBodyData self = new GetSparkReplSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkReplSessionResponseBodyData setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public GetSparkReplSessionResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public GetSparkReplSessionResponseBodyData setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public GetSparkReplSessionResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetSparkReplSessionResponseBodyData setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public GetSparkReplSessionResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSparkReplSessionResponseBodyData setWebUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

    }

}
