// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ListBackupsResponseBody extends TeaModel {
    /**
     * <p>The backups returned.</p>
     */
    @NameInMap("Backups")
    public java.util.List<ListBackupsResponseBodyBackups> backups;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsResponseBody self = new ListBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupsResponseBody setBackups(java.util.List<ListBackupsResponseBodyBackups> backups) {
        this.backups = backups;
        return this;
    }
    public java.util.List<ListBackupsResponseBodyBackups> getBackups() {
        return this.backups;
    }

    public ListBackupsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBackupsResponseBodyBackups extends TeaModel {
        /**
         * <p>The number of images that are automatically backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoImageCount")
        public Long autoImageCount;

        /**
         * <p>The backup time on the hour that is in the 24-hour clock.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("BackupHourInDay")
        public String backupHourInDay;

        /**
         * <p>The ID of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-1648438****</p>
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
         * <p>1637229596000</p>
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
         * <p>The ID of the HSM that is associated with the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-vj30bil8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of images.</p>
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
         * <p>The time when the image is created next time. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
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
         * <p>hsm-cn-vj30bil8****</p>
         */
        @NameInMap("OwnerInstanceId")
        public String ownerInstanceId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
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
         * <p>normal backup</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the backup. This parameter is available only for HSM backups in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-fdb897sdfg534-****</p>
         */
        @NameInMap("SpInstanceId")
        public String spInstanceId;

        /**
         * <p>The status of the backup. Valid values:</p>
         * <ul>
         * <li>NEW: The backup is disabled.</li>
         * <li>EXPIRED: The backup expired.</li>
         * <li>ENABLED: The backup is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
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
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListBackupsResponseBodyBackups build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsResponseBodyBackups self = new ListBackupsResponseBodyBackups();
            return TeaModel.build(map, self);
        }

        public ListBackupsResponseBodyBackups setAutoImageCount(Long autoImageCount) {
            this.autoImageCount = autoImageCount;
            return this;
        }
        public Long getAutoImageCount() {
            return this.autoImageCount;
        }

        public ListBackupsResponseBodyBackups setBackupHourInDay(String backupHourInDay) {
            this.backupHourInDay = backupHourInDay;
            return this;
        }
        public String getBackupHourInDay() {
            return this.backupHourInDay;
        }

        public ListBackupsResponseBodyBackups setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListBackupsResponseBodyBackups setBackupPeriod(Long backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public Long getBackupPeriod() {
            return this.backupPeriod;
        }

        public ListBackupsResponseBodyBackups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListBackupsResponseBodyBackups setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListBackupsResponseBodyBackups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBackupsResponseBodyBackups setMaxImageCount(String maxImageCount) {
            this.maxImageCount = maxImageCount;
            return this;
        }
        public String getMaxImageCount() {
            return this.maxImageCount;
        }

        public ListBackupsResponseBodyBackups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBackupsResponseBodyBackups setNextImageCreateTime(Long nextImageCreateTime) {
            this.nextImageCreateTime = nextImageCreateTime;
            return this;
        }
        public Long getNextImageCreateTime() {
            return this.nextImageCreateTime;
        }

        public ListBackupsResponseBodyBackups setOwnerInstanceId(String ownerInstanceId) {
            this.ownerInstanceId = ownerInstanceId;
            return this;
        }
        public String getOwnerInstanceId() {
            return this.ownerInstanceId;
        }

        public ListBackupsResponseBodyBackups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBackupsResponseBodyBackups setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public ListBackupsResponseBodyBackups setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListBackupsResponseBodyBackups setSpInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        public ListBackupsResponseBodyBackups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBackupsResponseBodyBackups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
