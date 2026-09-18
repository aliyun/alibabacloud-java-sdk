// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class TestConnectivityResponseBody extends TeaModel {
    /**
     * <p>The result details of the connectivity test.</p>
     */
    @NameInMap("Data")
    public TestConnectivityResponseBodyData data;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TestConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestConnectivityResponseBody self = new TestConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public TestConnectivityResponseBody setData(TestConnectivityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestConnectivityResponseBodyData getData() {
        return this.data;
    }

    public TestConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TestConnectivityResponseBodyData extends TeaModel {
        /**
         * <p>The tracking identifier of the connectivity test. The system generates this value for the first call. For polling calls, this value is the same as the CheckId in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-a1b2c3d4e5f67890</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The end-to-end latency of the target service response, in milliseconds. This value may be 0 or not returned when VerifyStatus is checking.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("LatencyMs")
        public Long latencyMs;

        /**
         * <p>The detailed information of the verification result. When VerifyStatus is verified, this value is a snippet of the response returned by the target service. When VerifyStatus is failed, this value describes the error cause, such as authentication failure, timeout, or empty response.</p>
         * 
         * <strong>example:</strong>
         * <p>Connectivity verification succeeded</p>
         */
        @NameInMap("VerifyMessage")
        public String verifyMessage;

        /**
         * <p>The current status of the connectivity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("VerifyStatus")
        public String verifyStatus;

        public static TestConnectivityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestConnectivityResponseBodyData self = new TestConnectivityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestConnectivityResponseBodyData setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public TestConnectivityResponseBodyData setLatencyMs(Long latencyMs) {
            this.latencyMs = latencyMs;
            return this;
        }
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        public TestConnectivityResponseBodyData setVerifyMessage(String verifyMessage) {
            this.verifyMessage = verifyMessage;
            return this;
        }
        public String getVerifyMessage() {
            return this.verifyMessage;
        }

        public TestConnectivityResponseBodyData setVerifyStatus(String verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

    }

}
