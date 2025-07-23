// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetBackupResponseBody extends TeaModel {
    /**
     * <p>The information about the backup.</p>
     */
    @NameInMap("Backup")
    public GetBackupResponseBodyBackup backup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupResponseBody self = new GetBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupResponseBody setBackup(GetBackupResponseBodyBackup backup) {
        this.backup = backup;
        return this;
    }
    public GetBackupResponseBodyBackup getBackup() {
        return this.backup;
    }

    public GetBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBackupResponseBodyBackup extends TeaModel {
        /**
         * <p>The number of images that are automatically backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoImageCount")
        public Long autoImageCount;

        /**
         * <p>The backup time in the 24-hour format.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BackupHourInDay")
        public String backupHourInDay;

        /**
         * <p>The ID of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-fdb897sdf****</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The automatic backup cycle. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BackupPeriod")
        public Long backupPeriod;

        /**
         * <p>The time when the backup is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1682417553781</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The expiration time of the backup. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1682417553781</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the hardware security module (HSM) that is associated with the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-5yd35431****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxImageCount")
        public String maxImageCount;

        /**
         * <p>The name of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-te****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next time when the image is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1682417553781</p>
         */
        @NameInMap("NextImageCreateTime")
        public Long nextImageCreateTime;

        /**
         * <p>The ID of the HSM to which the backup belongs. This parameter is available only for HSM backups outside the Chinese mainland and the value of this parameter is consistent with the value of InstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-huoahd****</p>
         */
        @NameInMap("OwnerInstanceId")
        public String ownerInstanceId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the backup is released. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1641275680000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The description of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the backup. This parameter is available only for HSM backups in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-fdb897sdfg53****</p>
         */
        @NameInMap("SpInstanceId")
        public String spInstanceId;

        /**
         * <p>The status of the backup. Valid values:</p>
         * <ul>
         * <li>NEW</li>
         * <li>EXPIRED</li>
         * <li>ENABLED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the backup. Valid values:</p>
         * <ul>
         * <li>DEFAULT</li>
         * <li>NORMAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBackupResponseBodyBackup build(java.util.Map<String, ?> map) throws Exception {
            GetBackupResponseBodyBackup self = new GetBackupResponseBodyBackup();
            return TeaModel.build(map, self);
        }

        public GetBackupResponseBodyBackup setAutoImageCount(Long autoImageCount) {
            this.autoImageCount = autoImageCount;
            return this;
        }
        public Long getAutoImageCount() {
            return this.autoImageCount;
        }

        public GetBackupResponseBodyBackup setBackupHourInDay(String backupHourInDay) {
            this.backupHourInDay = backupHourInDay;
            return this;
        }
        public String getBackupHourInDay() {
            return this.backupHourInDay;
        }

        public GetBackupResponseBodyBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public GetBackupResponseBodyBackup setBackupPeriod(Long backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public Long getBackupPeriod() {
            return this.backupPeriod;
        }

        public GetBackupResponseBodyBackup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetBackupResponseBodyBackup setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetBackupResponseBodyBackup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetBackupResponseBodyBackup setMaxImageCount(String maxImageCount) {
            this.maxImageCount = maxImageCount;
            return this;
        }
        public String getMaxImageCount() {
            return this.maxImageCount;
        }

        public GetBackupResponseBodyBackup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBackupResponseBodyBackup setNextImageCreateTime(Long nextImageCreateTime) {
            this.nextImageCreateTime = nextImageCreateTime;
            return this;
        }
        public Long getNextImageCreateTime() {
            return this.nextImageCreateTime;
        }

        public GetBackupResponseBodyBackup setOwnerInstanceId(String ownerInstanceId) {
            this.ownerInstanceId = ownerInstanceId;
            return this;
        }
        public String getOwnerInstanceId() {
            return this.ownerInstanceId;
        }

        public GetBackupResponseBodyBackup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetBackupResponseBodyBackup setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetBackupResponseBodyBackup setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetBackupResponseBodyBackup setSpInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        public GetBackupResponseBodyBackup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBackupResponseBodyBackup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
