// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateScheduledBackupConfigRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of scheduled backups to retain. For example, if you set this parameter to <code>3</code>, the system retains the three most recent backups and automatically deletes any older ones.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("dataKeepQuantity")
    public Integer dataKeepQuantity;

    /**
     * <p>The destination region for the backup. This parameter applies only to remote backups and enables cross-region disaster recovery. For example, you can back up an instance from China (Hangzhou) to China (Beijing).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("dstRegion")
    public String dstRegion;

    /**
     * <p>Specifies whether to enable scheduled backups. Set this parameter to <code>true</code> to enable scheduled backups, or <code>false</code> to disable them.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The hour to start the backup. This start time applies to all specified days. For example, if you set <code>week</code> to <code>1,3,5</code> and <code>hour</code> to <code>20</code>, a backup starts at 20:00:00 every Monday, Wednesday, and Friday.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("hour")
    public Integer hour;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hgprecn-cn-zvp25ysxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The number of manual backups to retain. Manual backups and automatic backups are stored separately and have independent retention policies.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("manualDataKeepQuantity")
    public Integer manualDataKeepQuantity;

    /**
     * <p>The backup type. This parameter is required only for remote backups.</p>
     * 
     * <strong>example:</strong>
     * <p>remote</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>Specifies the days of the week on which to perform a backup. Separate multiple days with commas. For example, to perform backups on Monday, Wednesday, and Friday, set this parameter to <code>1,3,5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5</p>
     */
    @NameInMap("week")
    public String week;

    /**
     * <p>The destination availability zone for the backup. This parameter applies only to remote backups.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static UpdateScheduledBackupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledBackupConfigRequest self = new UpdateScheduledBackupConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledBackupConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateScheduledBackupConfigRequest setDataKeepQuantity(Integer dataKeepQuantity) {
        this.dataKeepQuantity = dataKeepQuantity;
        return this;
    }
    public Integer getDataKeepQuantity() {
        return this.dataKeepQuantity;
    }

    public UpdateScheduledBackupConfigRequest setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
        return this;
    }
    public String getDstRegion() {
        return this.dstRegion;
    }

    public UpdateScheduledBackupConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateScheduledBackupConfigRequest setHour(Integer hour) {
        this.hour = hour;
        return this;
    }
    public Integer getHour() {
        return this.hour;
    }

    public UpdateScheduledBackupConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduledBackupConfigRequest setManualDataKeepQuantity(Integer manualDataKeepQuantity) {
        this.manualDataKeepQuantity = manualDataKeepQuantity;
        return this;
    }
    public Integer getManualDataKeepQuantity() {
        return this.manualDataKeepQuantity;
    }

    public UpdateScheduledBackupConfigRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateScheduledBackupConfigRequest setWeek(String week) {
        this.week = week;
        return this;
    }
    public String getWeek() {
        return this.week;
    }

    public UpdateScheduledBackupConfigRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
