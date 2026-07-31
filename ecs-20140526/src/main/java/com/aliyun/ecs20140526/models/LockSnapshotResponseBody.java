// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LockSnapshotResponseBody extends TeaModel {
    /**
     * <p>The locked snapshot information.</p>
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
         * <p>The cool-off period in compliance mode. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CoolOffPeriod")
        public Integer coolOffPeriod;

        /**
         * <p>The time when the cool-off period in compliance mode ends. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T13:00:00Z</p>
         */
        @NameInMap("CoolOffPeriodExpiredTime")
        public String coolOffPeriodExpiredTime;

        /**
         * <p>The time when the snapshot was locked. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockCreationTime")
        public String lockCreationTime;

        /**
         * <p>The lock duration. The snapshot lock automatically expires after the lock duration ends. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockDuration")
        public Integer lockDuration;

        /**
         * <p>The time when the lock duration starts. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. </p>
         * <p>If you lock a snapshot that is in the progressing state, the lock duration starts only after the snapshot enters the accomplished state.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-15T10:00:00Z</p>
         */
        @NameInMap("LockDurationStartTime")
        public String lockDurationStartTime;

        /**
         * <p>The time when the lock expires. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16T10:00:00Z</p>
         */
        @NameInMap("LockExpiredTime")
        public String lockExpiredTime;

        /**
         * <p>The lock mode. Valid values: </p>
         * <ul>
         * <li>compliance: The snapshot is locked in compliance mode. A snapshot locked in compliance mode cannot be unlocked by any user and can be deleted only after the lock duration expires. Users cannot shorten the lock duration, but users with the required RAM permissions can extend the lock duration at any time. When locking a snapshot in compliance mode, you can optionally specify a cool-off period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compliance</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The lock status. Valid values: </p>
         * <ul>
         * <li>compliance-cooloff: The snapshot is locked in compliance mode but is still within the cool-off period. The snapshot cannot be deleted, but users with the required RAM permissions can unlock the snapshot, extend or shorten the cool-off period, and extend or shorten the lock duration. </li>
         * <li>compliance: The snapshot is locked in compliance mode and the cool-off period has ended. The snapshot cannot be unlocked or deleted, but users with the required RAM permissions can extend the lock duration. </li>
         * <li>expired: The snapshot was previously locked, but the lock duration has ended and the lock has expired. The snapshot is currently unlocked and can be deleted.</li>
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
