// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicies")
    public java.util.List<DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies> autoSnapshotPolicies;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("DesktopNum")
        public Integer desktopNum;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RetentionDays")
        public String retentionDays;

        @NameInMap("Status")
        public String status;

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
