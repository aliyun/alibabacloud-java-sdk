// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLockedSnapshotsResponseBody extends TeaModel {
    /**
     * <p>Details about the locked snapshots.</p>
     */
    @NameInMap("LockedSnapshotsInfo")
    public java.util.List<DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo> lockedSnapshotsInfo;

    /**
     * <p>A token to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLockedSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLockedSnapshotsResponseBody self = new DescribeLockedSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLockedSnapshotsResponseBody setLockedSnapshotsInfo(java.util.List<DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo> lockedSnapshotsInfo) {
        this.lockedSnapshotsInfo = lockedSnapshotsInfo;
        return this;
    }
    public java.util.List<DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo> getLockedSnapshotsInfo() {
        return this.lockedSnapshotsInfo;
    }

    public DescribeLockedSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLockedSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo extends TeaModel {
        /**
         * <p>The cool-off period for compliance mode, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CoolOffPeriod")
        public Integer coolOffPeriod;

        /**
         * <p>The time when the cool-off period ends. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard and is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T13:00:00Z</p>
         */
        @NameInMap("CoolOffPeriodExpiredTime")
        public String coolOffPeriodExpiredTime;

        /**
         * <p>The time when the snapshot was locked. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard and is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockCreationTime")
        public String lockCreationTime;

        /**
         * <p>The lock duration in days. The lock automatically expires when this period ends.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockDuration")
        public Integer lockDuration;

        /**
         * <p>The time when the lock duration starts. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard and is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format. If a snapshot in the progressing state is locked, its lock duration begins after it enters the accomplished state.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockDurationStartTime")
        public String lockDurationStartTime;

        /**
         * <p>The time when the lock expires. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard and is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16T10:00:00Z</p>
         */
        @NameInMap("LockExpiredTime")
        public String lockExpiredTime;

        /**
         * <p>The lock mode. Valid value:</p>
         * <ul>
         * <li>compliance: The snapshot is locked in compliance mode. A snapshot locked in compliance mode cannot be unlocked and can only be deleted after its lock duration expires. You cannot shorten the lock duration, but users with the required RAM permissions can extend the lock duration at any time. When you lock a snapshot in compliance mode, you can optionally specify a cool-off period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compliance</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The lock status. Valid values:</p>
         * <ul>
         * <li><p>compliance-cooloff: The snapshot is locked in compliance mode and is in the cool-off period. The snapshot cannot be deleted. However, users with the required RAM permissions can unlock the snapshot and adjust the cool-off period or lock duration.</p>
         * </li>
         * <li><p>compliance: The snapshot is locked in compliance mode, and its cool-off period has ended. The snapshot cannot be unlocked or deleted. However, users with the required RAM permissions can extend the lock duration.</p>
         * </li>
         * <li><p>expired: The lock has expired, and the snapshot can be deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compliance-cooloff</p>
         */
        @NameInMap("LockStatus")
        public String lockStatus;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo self = new DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setCoolOffPeriod(Integer coolOffPeriod) {
            this.coolOffPeriod = coolOffPeriod;
            return this;
        }
        public Integer getCoolOffPeriod() {
            return this.coolOffPeriod;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setCoolOffPeriodExpiredTime(String coolOffPeriodExpiredTime) {
            this.coolOffPeriodExpiredTime = coolOffPeriodExpiredTime;
            return this;
        }
        public String getCoolOffPeriodExpiredTime() {
            return this.coolOffPeriodExpiredTime;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockCreationTime(String lockCreationTime) {
            this.lockCreationTime = lockCreationTime;
            return this;
        }
        public String getLockCreationTime() {
            return this.lockCreationTime;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockDuration(Integer lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Integer getLockDuration() {
            return this.lockDuration;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockDurationStartTime(String lockDurationStartTime) {
            this.lockDurationStartTime = lockDurationStartTime;
            return this;
        }
        public String getLockDurationStartTime() {
            return this.lockDurationStartTime;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockExpiredTime(String lockExpiredTime) {
            this.lockExpiredTime = lockExpiredTime;
            return this;
        }
        public String getLockExpiredTime() {
            return this.lockExpiredTime;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setLockStatus(String lockStatus) {
            this.lockStatus = lockStatus;
            return this;
        }
        public String getLockStatus() {
            return this.lockStatus;
        }

        public DescribeLockedSnapshotsResponseBodyLockedSnapshotsInfo setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

}
