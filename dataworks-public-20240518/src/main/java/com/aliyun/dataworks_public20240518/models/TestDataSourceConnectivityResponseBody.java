// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TestDataSourceConnectivityResponseBody extends TeaModel {
    /**
     * <p>The details of the connectivity test.</p>
     */
    @NameInMap("Connectivity")
    public TestDataSourceConnectivityResponseBodyConnectivity connectivity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CDF7B72-020B-542A-8465-21CFFA81****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TestDataSourceConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestDataSourceConnectivityResponseBody self = new TestDataSourceConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public TestDataSourceConnectivityResponseBody setConnectivity(TestDataSourceConnectivityResponseBodyConnectivity connectivity) {
        this.connectivity = connectivity;
        return this;
    }
    public TestDataSourceConnectivityResponseBodyConnectivity getConnectivity() {
        return this.connectivity;
    }

    public TestDataSourceConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TestDataSourceConnectivityResponseBodyConnectivityDetailLogs extends TeaModel {
        /**
         * <p>The code of the test item.</p>
         * 
         * <strong>example:</strong>
         * <p>validate_input_parameters</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The end time of a step.</p>
         * 
         * <strong>example:</strong>
         * <p>1730217604002</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the step.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The start time of a step.</p>
         * 
         * <strong>example:</strong>
         * <p>1730217600001</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static TestDataSourceConnectivityResponseBodyConnectivityDetailLogs build(java.util.Map<String, ?> map) throws Exception {
            TestDataSourceConnectivityResponseBodyConnectivityDetailLogs self = new TestDataSourceConnectivityResponseBodyConnectivityDetailLogs();
            return TeaModel.build(map, self);
        }

        public TestDataSourceConnectivityResponseBodyConnectivityDetailLogs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TestDataSourceConnectivityResponseBodyConnectivityDetailLogs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public TestDataSourceConnectivityResponseBodyConnectivityDetailLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TestDataSourceConnectivityResponseBodyConnectivityDetailLogs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class TestDataSourceConnectivityResponseBodyConnectivity extends TeaModel {
        /**
         * <p>The error message returned if the connectivity test fails. No such a message is returned if the connectivity test is successful.</p>
         */
        @NameInMap("ConnectMessage")
        public String connectMessage;

        /**
         * <p>The result of the connectivity test. Valid values: Connectable: The network can be connected. ConfigError: The network can be connected, but the configurations are incorrect. Unreachable: The network cannot be connected. Unsupport: An error is reported due to other causes. For example, the desired resource group is being initialized.</p>
         * 
         * <strong>example:</strong>
         * <p>Connectable</p>
         */
        @NameInMap("ConnectState")
        public String connectState;

        /**
         * <p>The detailed logs of each step in the connectivity test.</p>
         */
        @NameInMap("DetailLogs")
        public java.util.List<TestDataSourceConnectivityResponseBodyConnectivityDetailLogs> detailLogs;

        public static TestDataSourceConnectivityResponseBodyConnectivity build(java.util.Map<String, ?> map) throws Exception {
            TestDataSourceConnectivityResponseBodyConnectivity self = new TestDataSourceConnectivityResponseBodyConnectivity();
            return TeaModel.build(map, self);
        }

        public TestDataSourceConnectivityResponseBodyConnectivity setConnectMessage(String connectMessage) {
            this.connectMessage = connectMessage;
            return this;
        }
        public String getConnectMessage() {
            return this.connectMessage;
        }

        public TestDataSourceConnectivityResponseBodyConnectivity setConnectState(String connectState) {
            this.connectState = connectState;
            return this;
        }
        public String getConnectState() {
            return this.connectState;
        }

        public TestDataSourceConnectivityResponseBodyConnectivity setDetailLogs(java.util.List<TestDataSourceConnectivityResponseBodyConnectivityDetailLogs> detailLogs) {
            this.detailLogs = detailLogs;
            return this;
        }
        public java.util.List<TestDataSourceConnectivityResponseBodyConnectivityDetailLogs> getDetailLogs() {
            return this.detailLogs;
        }

    }

}
