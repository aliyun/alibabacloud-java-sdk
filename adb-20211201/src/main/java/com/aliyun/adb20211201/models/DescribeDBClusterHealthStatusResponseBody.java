// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthStatusResponseBody extends TeaModel {
    /**
     * <p>Details of the authentication failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication failed.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The health status of the instance access nodes.</p>
     */
    @NameInMap("CS")
    public DescribeDBClusterHealthStatusResponseBodyCS CS;

    /**
     * <p>The health status of the executor groups.</p>
     */
    @NameInMap("Executor")
    public DescribeDBClusterHealthStatusResponseBodyExecutor executor;

    /**
     * <p>The health status of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>RISK</strong>: The cluster is at risk.</p>
     * </li>
     * <li><p><strong>NORMAL</strong>: The cluster is healthy.</p>
     * </li>
     * <li><p><strong>UNAVAILABLE</strong>: The cluster is unavailable.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The cluster health status is considered <strong>NORMAL</strong> only if the instance access nodes, executor groups, and worker node groups are all <strong>NORMAL</strong>, and the instance is responsive. If any of these components has a <strong>RISK</strong> status, the cluster status is <strong>RISK</strong>. If any component has an <strong>UNAVAILABLE</strong> status, the cluster status is <strong>UNAVAILABLE</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CAV</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health status of the worker node groups.</p>
     */
    @NameInMap("Worker")
    public DescribeDBClusterHealthStatusResponseBodyWorker worker;

    public static DescribeDBClusterHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterHealthStatusResponseBody self = new DescribeDBClusterHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterHealthStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * <p>The number of healthy instance access nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of instance access nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of instance access nodes at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health status of the instance access nodes. Valid values:</p>
         * <ul>
         * <li><p><strong>RISK</strong>: The instance access nodes are at risk.</p>
         * </li>
         * <li><p><strong>NORMAL</strong>: The instance access nodes are healthy.</p>
         * </li>
         * <li><p><strong>UNAVAILABLE</strong>: The instance access nodes are unavailable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNAVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable instance access nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The number of healthy executor nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of executor nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of executor nodes at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health status of the executor groups. Valid values:</p>
         * <ul>
         * <li><p><strong>RISK</strong>: The executor groups are at risk.</p>
         * </li>
         * <li><p><strong>NORMAL</strong>: The executor groups are healthy.</p>
         * </li>
         * <li><p><strong>UNAVAILABLE</strong>: The executor groups are unavailable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNAVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable executor nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The number of healthy worker node groups.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The total number of worker node groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpectedCount")
        public Long expectedCount;

        /**
         * <p>The number of worker node groups at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The health status of the worker node groups. Valid values:</p>
         * <ul>
         * <li><p><strong>RISK</strong>: The worker node groups are at risk.</p>
         * </li>
         * <li><p><strong>NORMAL</strong>: The worker node groups are healthy.</p>
         * </li>
         * <li><p><strong>UNAVAILABLE</strong>: The worker node groups are unavailable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNAVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of unavailable worker node groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
