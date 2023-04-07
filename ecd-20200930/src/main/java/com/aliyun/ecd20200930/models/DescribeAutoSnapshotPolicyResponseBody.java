// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>Details of the automatic snapshot policies.</p>
     */
    @NameInMap("AutoSnapshotPolicies")
    public java.util.List<DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies> autoSnapshotPolicies;

    /**
     * <p>The token that is used to start the next query. If this parameter is empty, all results haven been returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyResponseBody self = new DescribeAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyResponseBody setAutoSnapshotPolicies(java.util.List<DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies> autoSnapshotPolicies) {
        this.autoSnapshotPolicies = autoSnapshotPolicies;
        return this;
    }
    public java.util.List<DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies> getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    public DescribeAutoSnapshotPolicyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies extends TeaModel {
        /**
         * <p>The time when the automatic snapshot policy was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The CRON expression that is used to create the snapshot.</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The number of cloud desktops that are associated with the automatic snapshot policy.</p>
         */
        @NameInMap("DesktopNum")
        public Integer desktopNum;

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the automatic snapshot policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The ID of the region where the automatic snapshot policy resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The retention period of the automatic snapshot. Unit: days. Valid values:</p>
         * <br>
         * <p>*   \-1: The snapshot is permanently retained.</p>
         * <p>*   1 to 65536: The automatic snapshot is retained for the specified number of days.</p>
         */
        @NameInMap("RetentionDays")
        public String retentionDays;

        /**
         * <p>The state of the automatic snapshot policy. Valid values:</p>
         * <br>
         * <p>*   Normal: The automatic snapshot policy is normal.</p>
         * <p>*   Expire: The automatic snapshot policy cannot be used because your account has an overdue payment.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The points in time at which automatic snapshots are created.</p>
         * <br>
         * <p>The time is displayed in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. 1 indicates 01:00:00. Multiple points in time can be specified.</p>
         * <br>
         * <p>The parameter value is a JSON array that contains up to 24 points in time separated by commas (,). Example: `["0", "1", ... "23"]`.</p>
         */
        @NameInMap("TimePoints")
        public String timePoints;

        public static DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies self = new DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setDesktopNum(Integer desktopNum) {
            this.desktopNum = desktopNum;
            return this;
        }
        public Integer getDesktopNum() {
            return this.desktopNum;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setRetentionDays(String retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public String getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setTimePoints(String timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public String getTimePoints() {
            return this.timePoints;
        }

    }

}
