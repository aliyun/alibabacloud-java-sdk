// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthStatusResponseBody extends TeaModel {
    @NameInMap("CS")
    public DescribeDBClusterHealthStatusResponseBodyCS CS;

    @NameInMap("Executor")
    public DescribeDBClusterHealthStatusResponseBodyExecutor executor;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Worker")
    public DescribeDBClusterHealthStatusResponseBodyWorker worker;

    public static DescribeDBClusterHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterHealthStatusResponseBody self = new DescribeDBClusterHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterHealthStatusResponseBody setCS(DescribeDBClusterHealthStatusResponseBodyCS CS) {
        this.CS = CS;
        return this;
    }
    public DescribeDBClusterHealthStatusResponseBodyCS getCS() {
        return this.CS;
    }

    public DescribeDBClusterHealthStatusResponseBody setExecutor(DescribeDBClusterHealthStatusResponseBodyExecutor executor) {
        this.executor = executor;
        return this;
    }
    public DescribeDBClusterHealthStatusResponseBodyExecutor getExecutor() {
        return this.executor;
    }

    public DescribeDBClusterHealthStatusResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDBClusterHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterHealthStatusResponseBody setWorker(DescribeDBClusterHealthStatusResponseBodyWorker worker) {
        this.worker = worker;
        return this;
    }
    public DescribeDBClusterHealthStatusResponseBodyWorker getWorker() {
        return this.worker;
    }

    public static class DescribeDBClusterHealthStatusResponseBodyCS extends TeaModel {
        @NameInMap("ActiveCount")
        public Long activeCount;

        @NameInMap("ExpectedCount")
        public Long expectedCount;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("UnavailableCount")
        public Long unavailableCount;

        public static DescribeDBClusterHealthStatusResponseBodyCS build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterHealthStatusResponseBodyCS self = new DescribeDBClusterHealthStatusResponseBodyCS();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterHealthStatusResponseBodyCS setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyCS setExpectedCount(Long expectedCount) {
            this.expectedCount = expectedCount;
            return this;
        }
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyCS setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyCS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClusterHealthStatusResponseBodyCS setUnavailableCount(Long unavailableCount) {
            this.unavailableCount = unavailableCount;
            return this;
        }
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

    }

    public static class DescribeDBClusterHealthStatusResponseBodyExecutor extends TeaModel {
        @NameInMap("ActiveCount")
        public Long activeCount;

        @NameInMap("ExpectedCount")
        public Long expectedCount;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("UnavailableCount")
        public Long unavailableCount;

        public static DescribeDBClusterHealthStatusResponseBodyExecutor build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterHealthStatusResponseBodyExecutor self = new DescribeDBClusterHealthStatusResponseBodyExecutor();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterHealthStatusResponseBodyExecutor setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyExecutor setExpectedCount(Long expectedCount) {
            this.expectedCount = expectedCount;
            return this;
        }
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyExecutor setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyExecutor setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClusterHealthStatusResponseBodyExecutor setUnavailableCount(Long unavailableCount) {
            this.unavailableCount = unavailableCount;
            return this;
        }
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

    }

    public static class DescribeDBClusterHealthStatusResponseBodyWorker extends TeaModel {
        @NameInMap("ActiveCount")
        public Long activeCount;

        @NameInMap("ExpectedCount")
        public Long expectedCount;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("UnavailableCount")
        public Long unavailableCount;

        public static DescribeDBClusterHealthStatusResponseBodyWorker build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterHealthStatusResponseBodyWorker self = new DescribeDBClusterHealthStatusResponseBodyWorker();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterHealthStatusResponseBodyWorker setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyWorker setExpectedCount(Long expectedCount) {
            this.expectedCount = expectedCount;
            return this;
        }
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyWorker setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeDBClusterHealthStatusResponseBodyWorker setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClusterHealthStatusResponseBodyWorker setUnavailableCount(Long unavailableCount) {
            this.unavailableCount = unavailableCount;
            return this;
        }
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

    }

}
