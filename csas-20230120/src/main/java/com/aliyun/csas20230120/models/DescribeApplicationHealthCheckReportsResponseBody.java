// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DescribeApplicationHealthCheckReportsResponseBody extends TeaModel {
    /**
     * <p>The list of health check reports.</p>
     */
    @NameInMap("Reports")
    public java.util.List<DescribeApplicationHealthCheckReportsResponseBodyReports> reports;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationHealthCheckReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationHealthCheckReportsResponseBody self = new DescribeApplicationHealthCheckReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationHealthCheckReportsResponseBody setReports(java.util.List<DescribeApplicationHealthCheckReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<DescribeApplicationHealthCheckReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public DescribeApplicationHealthCheckReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApplicationHealthCheckReportsResponseBodyReports extends TeaModel {
        /**
         * <p>The ID of the internal-facing application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The list of addresses where health checks failed.</p>
         */
        @NameInMap("FailedAddresses")
        public java.util.List<String> failedAddresses;

        /**
         * <p>The list of regions where health checks failed.</p>
         */
        @NameInMap("FailedRegions")
        public java.util.List<String> failedRegions;

        /**
         * <p>The number of failed health checks within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailureCount")
        public Long failureCount;

        /**
         * <p>The list of reasons for health check failures.</p>
         */
        @NameInMap("FailureReasons")
        public java.util.List<String> failureReasons;

        /**
         * <p>The status calculated based on the latest check result. Valid values:</p>
         * <ul>
         * <li>normal: The success rate of the latest check is greater than or equal to 95%.</li>
         * <li>partialError: The success rate of the latest check is greater than 0 and less than 95%.</li>
         * <li>error: The success rate of the latest check is 0.</li>
         * <li>uncompleted: No check results are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("HealthCheckStatus")
        public String healthCheckStatus;

        /**
         * <p>The health check mode. Valid values:</p>
         * <ul>
         * <li>OnAccess: on-access check</li>
         * <li>Continuous: continuous check</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OnAccess</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The number of successful health checks within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static DescribeApplicationHealthCheckReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationHealthCheckReportsResponseBodyReports self = new DescribeApplicationHealthCheckReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setFailedAddresses(java.util.List<String> failedAddresses) {
            this.failedAddresses = failedAddresses;
            return this;
        }
        public java.util.List<String> getFailedAddresses() {
            return this.failedAddresses;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setFailedRegions(java.util.List<String> failedRegions) {
            this.failedRegions = failedRegions;
            return this;
        }
        public java.util.List<String> getFailedRegions() {
            return this.failedRegions;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setFailureReasons(java.util.List<String> failureReasons) {
            this.failureReasons = failureReasons;
            return this;
        }
        public java.util.List<String> getFailureReasons() {
            return this.failureReasons;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setHealthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }
        public String getHealthCheckStatus() {
            return this.healthCheckStatus;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeApplicationHealthCheckReportsResponseBodyReports setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

}
