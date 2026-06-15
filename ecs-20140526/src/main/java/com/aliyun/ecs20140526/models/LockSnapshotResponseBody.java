// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LockSnapshotResponseBody extends TeaModel {
    /**
     * <p>Information about the locked snapshot.</p>
     */
    @NameInMap("LockedSnapshotInfo")
    public LockSnapshotResponseBodyLockedSnapshotInfo lockedSnapshotInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LockSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockSnapshotResponseBody self = new LockSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public LockSnapshotResponseBody setLockedSnapshotInfo(LockSnapshotResponseBodyLockedSnapshotInfo lockedSnapshotInfo) {
        this.lockedSnapshotInfo = lockedSnapshotInfo;
        return this;
    }
    public LockSnapshotResponseBodyLockedSnapshotInfo getLockedSnapshotInfo() {
        return this.lockedSnapshotInfo;
    }

    public LockSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LockSnapshotResponseBodyLockedSnapshotInfo extends TeaModel {
        /**
         * <p>The cool-off period for compliance mode. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CoolOffPeriod")
        public Integer coolOffPeriod;

        /**
         * <p>The time the cool-off period for compliance mode ends. The time is in UTC and follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T13:00:00Z</p>
         */
        @NameInMap("CoolOffPeriodExpiredTime")
        public String coolOffPeriodExpiredTime;

        /**
         * <p>The time the lock was created. The time is in UTC and follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockCreationTime")
        public String lockCreationTime;

        /**
         * <p>The lock duration, in days. The snapshot lock automatically expires at the end of this period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockDuration")
        public Integer lockDuration;

        /**
         * <p>The time the lock duration starts. The time is in UTC and follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * <p>If you lock a snapshot that is in the <code>progressing</code> state, the lock duration starts only after the snapshot enters the <code>accomplished</code> state.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockDurationStartTime")
        public String lockDurationStartTime;

        /**
         * <p>The time the lock expires. The time is in UTC and follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16T10:00:00Z</p>
         */
        @NameInMap("LockExpiredTime")
        public String lockExpiredTime;

        /**
         * <p>The lock mode. Possible value:</p>
         * <ul>
         * <li><code>compliance</code>: The snapshot is locked in compliance mode. A snapshot in compliance mode cannot be unlocked and can be deleted only after its lock duration expires. You cannot shorten the lock duration, but users with the required Resource Access Management (RAM) permissions can extend it at any time. When you lock a snapshot in compliance mode, you can optionally specify a cool-off period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compliance</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The lock status. Possible values:</p>
         * <ul>
         * <li><p><code>compliance-cooloff</code>: The snapshot is locked in compliance mode but is still in its cool-off period. The snapshot cannot be deleted. However, users with the required Resource Access Management (RAM) permissions can unlock it, change the cool-off period, and adjust the lock duration.</p>
         * </li>
         * <li><p><code>compliance</code>: The snapshot is locked in compliance mode, and the cool-off period has ended. The snapshot cannot be unlocked or deleted, but users with the required Resource Access Management (RAM) permissions can extend the lock duration.</p>
         * </li>
         * <li><p><code>expired</code>: The snapshot was previously locked, but the lock duration has ended, and the lock has expired. The snapshot is not currently locked and can be deleted.</p>
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
         * <p>s-9dp2qojdpdfmgfmf****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static LockSnapshotResponseBodyLockedSnapshotInfo build(java.util.Map<String, ?> map) throws Exception {
            LockSnapshotResponseBodyLockedSnapshotInfo self = new LockSnapshotResponseBodyLockedSnapshotInfo();
            return TeaModel.build(map, self);
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setCoolOffPeriod(Integer coolOffPeriod) {
            this.coolOffPeriod = coolOffPeriod;
            return this;
        }
        public Integer getCoolOffPeriod() {
            return this.coolOffPeriod;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setCoolOffPeriodExpiredTime(String coolOffPeriodExpiredTime) {
            this.coolOffPeriodExpiredTime = coolOffPeriodExpiredTime;
            return this;
        }
        public String getCoolOffPeriodExpiredTime() {
            return this.coolOffPeriodExpiredTime;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockCreationTime(String lockCreationTime) {
            this.lockCreationTime = lockCreationTime;
            return this;
        }
        public String getLockCreationTime() {
            return this.lockCreationTime;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockDuration(Integer lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Integer getLockDuration() {
            return this.lockDuration;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockDurationStartTime(String lockDurationStartTime) {
            this.lockDurationStartTime = lockDurationStartTime;
            return this;
        }
        public String getLockDurationStartTime() {
            return this.lockDurationStartTime;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockExpiredTime(String lockExpiredTime) {
            this.lockExpiredTime = lockExpiredTime;
            return this;
        }
        public String getLockExpiredTime() {
            return this.lockExpiredTime;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setLockStatus(String lockStatus) {
            this.lockStatus = lockStatus;
            return this;
        }
        public String getLockStatus() {
            return this.lockStatus;
        }

        public LockSnapshotResponseBodyLockedSnapshotInfo setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

}
