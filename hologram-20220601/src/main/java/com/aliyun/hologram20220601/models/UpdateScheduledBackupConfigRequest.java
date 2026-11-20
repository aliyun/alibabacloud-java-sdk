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
     * <p>The number of periodic backups to retain. For example, if you set this parameter to 3, the system automatically retains the latest three backups and deletes other expired backups.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("dataKeepQuantity")
    public Integer dataKeepQuantity;

    /**
     * <p>The destination region for backups. This parameter takes effect only for remote backups. You can back up data from the local region to another region to implement cross-region disaster recovery. For example, you can back up an instance in Hangzhou to Beijing.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("dstRegion")
    public String dstRegion;

    /**
     * <p>Specifies whether to enable periodic backup. Valid values:</p>
     * <ul>
     * <li>true: Periodic backup is enabled.</li>
     * <li>false: Periodic backup is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The start time for backup dates. The backup task starts at this time. The time applies to all valid dates. For example, if week is set to 1,3,5 and hour is set to 20, backups start at 20:00:00 every Monday, Wednesday, and Friday.</p>
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
     * <p>The number of manual backups to retain. Manual backups and automatic backups are stored separately, and each has a completely independent data retention policy.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("manualDataKeepQuantity")
    public Integer manualDataKeepQuantity;

    /**
     * <p>The backup type. You need to configure this field only for remote backups. You can ignore this field for other backup types.</p>
     * 
     * <strong>example:</strong>
     * <p>remote</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>The weekly configuration for backup dates. You can specify multiple days separated by commas. For example, to configure Monday, Wednesday, and Friday, set the value to &quot;1,3,5&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5</p>
     */
    @NameInMap("week")
    public String week;

    /**
     * <p>The destination zone for backups. This parameter takes effect only for remote backups.</p>
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
