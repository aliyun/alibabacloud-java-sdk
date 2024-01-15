// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopOversoldGroupRequest extends TeaModel {
    @NameInMap("ConcurrenceCount")
    public Integer concurrenceCount;

    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OversoldUserCount")
    public Integer oversoldUserCount;

    @NameInMap("OversoldWarn")
    public Integer oversoldWarn;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("StopDuration")
    public Integer stopDuration;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    public static CreateDesktopOversoldGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopOversoldGroupRequest self = new CreateDesktopOversoldGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopOversoldGroupRequest setConcurrenceCount(Integer concurrenceCount) {
        this.concurrenceCount = concurrenceCount;
        return this;
    }
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    public CreateDesktopOversoldGroupRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public CreateDesktopOversoldGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDesktopOversoldGroupRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public CreateDesktopOversoldGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDesktopOversoldGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateDesktopOversoldGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDesktopOversoldGroupRequest setOversoldUserCount(Integer oversoldUserCount) {
        this.oversoldUserCount = oversoldUserCount;
        return this;
    }
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    public CreateDesktopOversoldGroupRequest setOversoldWarn(Integer oversoldWarn) {
        this.oversoldWarn = oversoldWarn;
        return this;
    }
    public Integer getOversoldWarn() {
        return this.oversoldWarn;
    }

    public CreateDesktopOversoldGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopOversoldGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopOversoldGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateDesktopOversoldGroupRequest setStopDuration(Integer stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Integer getStopDuration() {
        return this.stopDuration;
    }

    public CreateDesktopOversoldGroupRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
