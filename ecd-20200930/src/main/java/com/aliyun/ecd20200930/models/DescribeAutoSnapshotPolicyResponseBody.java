// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The automatic snapshot policies.</p>
     */
    @NameInMap("AutoSnapshotPolicies")
    public java.util.List<DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies> autoSnapshotPolicies;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return value is empty, no more results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F6612E-59CC-59F9-9DD1-91867FCC****</p>
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
         * <p>The time when the policy was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-11T09:14:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cron expression that is used to create snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 5,7 ? * 2/2</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The number of cloud computers to which the automatic snapshot policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopNum")
        public Integer desktopNum;

        /**
         * <p>The disk type for which the automatic snapshot policy is created.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system disk</p>
         * </li>
         * <li><p>DATA: data disk</p>
         * </li>
         * </ul>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-3e3bmfcdkjfl1****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot01</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The ID of the region where the automatic snapshot policy resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The retention period of automatic snapshots. Unit: days. Valid values: 1 to 180.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RetentionDays")
        public String retentionDays;

        /**
         * <p>The status of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The points in time when automatic snapshots are created.</p>
         * <p>The value is a JSON array of integers. Example: <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>. A maximum of 24 points in time can be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;17&quot;,&quot;18&quot;]</p>
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

        public DescribeAutoSnapshotPolicyResponseBodyAutoSnapshotPolicies setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
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
