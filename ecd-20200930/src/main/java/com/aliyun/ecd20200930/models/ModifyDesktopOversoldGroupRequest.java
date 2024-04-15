// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupRequest extends TeaModel {
    @NameInMap("ConcurrenceCount")
    public Integer concurrenceCount;

    @NameInMap("Description")
    public String description;

    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("KeepDuration")
    public Integer keepDuration;

    @NameInMap("Name")
    public String name;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("OversoldUserCount")
    public Integer oversoldUserCount;

    @NameInMap("OversoldWarn")
    public Integer oversoldWarn;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("StopDuration")
    public Integer stopDuration;

    public static ModifyDesktopOversoldGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupRequest self = new ModifyDesktopOversoldGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupRequest setConcurrenceCount(Integer concurrenceCount) {
        this.concurrenceCount = concurrenceCount;
        return this;
    }
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    public ModifyDesktopOversoldGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDesktopOversoldGroupRequest setIdleDisconnectDuration(Long idleDisconnectDuration) {
        this.idleDisconnectDuration = idleDisconnectDuration;
        return this;
    }
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    public ModifyDesktopOversoldGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyDesktopOversoldGroupRequest setKeepDuration(Integer keepDuration) {
        this.keepDuration = keepDuration;
        return this;
    }
    public Integer getKeepDuration() {
        return this.keepDuration;
    }

    public ModifyDesktopOversoldGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDesktopOversoldGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public ModifyDesktopOversoldGroupRequest setOversoldUserCount(Integer oversoldUserCount) {
        this.oversoldUserCount = oversoldUserCount;
        return this;
    }
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    public ModifyDesktopOversoldGroupRequest setOversoldWarn(Integer oversoldWarn) {
        this.oversoldWarn = oversoldWarn;
        return this;
    }
    public Integer getOversoldWarn() {
        return this.oversoldWarn;
    }

    public ModifyDesktopOversoldGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyDesktopOversoldGroupRequest setStopDuration(Integer stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Integer getStopDuration() {
        return this.stopDuration;
    }

}
