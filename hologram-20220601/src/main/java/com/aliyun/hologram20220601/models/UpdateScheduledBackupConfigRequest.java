// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateScheduledBackupConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("dataKeepQuantity")
    public Integer dataKeepQuantity;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("dstRegion")
    public String dstRegion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("hour")
    public Integer hour;

    /**
     * <strong>example:</strong>
     * <p>hgprecn-cn-zvp25ysxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("manualDataKeepQuantity")
    public Integer manualDataKeepQuantity;

    /**
     * <strong>example:</strong>
     * <p>remote</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <strong>example:</strong>
     * <p>1,3,5</p>
     */
    @NameInMap("week")
    public String week;

    /**
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
