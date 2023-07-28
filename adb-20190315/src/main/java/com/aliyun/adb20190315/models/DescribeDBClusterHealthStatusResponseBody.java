// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthStatusResponseBody extends TeaModel {
    /**
     * <p>Health state details of access nodes.</p>
     */
    @NameInMap("CS")
    public DescribeDBClusterHealthStatusResponseBodyCS CS;

    /**
     * <p>Health state details of compute node groups.</p>
     */
    @NameInMap("Executor")
    public DescribeDBClusterHealthStatusResponseBodyExecutor executor;

    /**
     * <p>The health state of the cluster. Valid values:</p>
     * <br>
     * <p>*   **RISK**: risky</p>
     * <br>
     * <p>*   **NORMAL**: healthy</p>
     * <br>
     * <p>*   **UNAVAILABLE**: unavailable</p>
     * <br>
     * <p>> If the health states of access nodes, compute node groups, and storage node groups are all **healthy** and the cluster is detected to be alive, the health state of the cluster is **healthy**. If the preceding three health states include **risky**, the health state of the cluster is **risky**. If the preceding three health states include **unavailable**, the health state of the cluster is **unavailable**.</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Health state details of storage node groups.</p>
     */
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
        /**
         * <p>The number of healthy access nodes.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of access nodes.</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of risky access nodes.</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health state of access nodes. Valid values:</p>
         * <br>
         * <p>*   **RISK**: risky</p>
         * <p>*   **NORMAL**: healthy</p>
         * <p>*   **UNAVAILABLE**: unavailable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable access nodes.</p>
         */
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
        /**
         * <p>The number of healthy compute node groups.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of compute node groups.</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of risky compute node groups.</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health state of compute node groups. Valid values:</p>
         * <br>
         * <p>*   **RISK**: risky</p>
         * <p>*   **NORMAL**: healthy</p>
         * <p>*   **UNAVAILABLE**: unavailable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable compute node groups.</p>
         */
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
        /**
         * <p>The number of healthy storage node groups.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of storage node groups.</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of risky storage node groups.</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health state of storage node groups. Valid values:</p>
         * <br>
         * <p>*   **RISK**: risky</p>
         * <p>*   **NORMAL**: healthy</p>
         * <p>*   **UNAVAILABLE**: unavailable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable storage node groups.</p>
         */
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
