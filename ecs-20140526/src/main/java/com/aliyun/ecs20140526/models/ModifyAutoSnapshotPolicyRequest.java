// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("SystemDiskPolicyEnabled")
    public Boolean systemDiskPolicyEnabled;

    @NameInMap("SystemDiskPolicyTimePeriod")
    public Integer systemDiskPolicyTimePeriod;

    @NameInMap("SystemDiskPolicyRetentionDays")
    public Integer systemDiskPolicyRetentionDays;

    @NameInMap("SystemDiskPolicyRetentionLastWeek")
    public Boolean systemDiskPolicyRetentionLastWeek;

    @NameInMap("DataDiskPolicyEnabled")
    public Boolean dataDiskPolicyEnabled;

    @NameInMap("DataDiskPolicyTimePeriod")
    public Integer dataDiskPolicyTimePeriod;

    @NameInMap("DataDiskPolicyRetentionDays")
    public Integer dataDiskPolicyRetentionDays;

    @NameInMap("DataDiskPolicyRetentionLastWeek")
    public Boolean dataDiskPolicyRetentionLastWeek;

    public static ModifyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyRequest self = new ModifyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyRequest setSystemDiskPolicyEnabled(Boolean systemDiskPolicyEnabled) {
        this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
        return this;
    }
    public Boolean getSystemDiskPolicyEnabled() {
        return this.systemDiskPolicyEnabled;
    }

    public ModifyAutoSnapshotPolicyRequest setSystemDiskPolicyTimePeriod(Integer systemDiskPolicyTimePeriod) {
        this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
        return this;
    }
    public Integer getSystemDiskPolicyTimePeriod() {
        return this.systemDiskPolicyTimePeriod;
    }

    public ModifyAutoSnapshotPolicyRequest setSystemDiskPolicyRetentionDays(Integer systemDiskPolicyRetentionDays) {
        this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
        return this;
    }
    public Integer getSystemDiskPolicyRetentionDays() {
        return this.systemDiskPolicyRetentionDays;
    }

    public ModifyAutoSnapshotPolicyRequest setSystemDiskPolicyRetentionLastWeek(Boolean systemDiskPolicyRetentionLastWeek) {
        this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
        return this;
    }
    public Boolean getSystemDiskPolicyRetentionLastWeek() {
        return this.systemDiskPolicyRetentionLastWeek;
    }

    public ModifyAutoSnapshotPolicyRequest setDataDiskPolicyEnabled(Boolean dataDiskPolicyEnabled) {
        this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
        return this;
    }
    public Boolean getDataDiskPolicyEnabled() {
        return this.dataDiskPolicyEnabled;
    }

    public ModifyAutoSnapshotPolicyRequest setDataDiskPolicyTimePeriod(Integer dataDiskPolicyTimePeriod) {
        this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
        return this;
    }
    public Integer getDataDiskPolicyTimePeriod() {
        return this.dataDiskPolicyTimePeriod;
    }

    public ModifyAutoSnapshotPolicyRequest setDataDiskPolicyRetentionDays(Integer dataDiskPolicyRetentionDays) {
        this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
        return this;
    }
    public Integer getDataDiskPolicyRetentionDays() {
        return this.dataDiskPolicyRetentionDays;
    }

    public ModifyAutoSnapshotPolicyRequest setDataDiskPolicyRetentionLastWeek(Boolean dataDiskPolicyRetentionLastWeek) {
        this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
        return this;
    }
    public Boolean getDataDiskPolicyRetentionLastWeek() {
        return this.dataDiskPolicyRetentionLastWeek;
    }

}
