// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimModelConfigRequest extends TeaModel {
    // 梁高
    @NameInMap("BeamHeight")
    public Long beamHeight;

    // 梁模式
    @NameInMap("BeamMode")
    public Long beamMode;

    // 梁偏移
    @NameInMap("BeamOffset")
    public Long beamOffset;

    // 门高
    @NameInMap("DoorHeight")
    public Long doorHeight;

    // 门偏移
    @NameInMap("DoorOffset")
    public Long doorOffset;

    @NameInMap("Id")
    public Long id;

    // 房间模式
    @NameInMap("RoomMode")
    public Long roomMode;

    // 板模式
    @NameInMap("SlabMode")
    public Long slabMode;

    // 板厚度
    @NameInMap("SlabThickness")
    public Long slabThickness;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    // 窗高
    @NameInMap("WindowHeight")
    public Long windowHeight;

    // 窗偏移
    @NameInMap("WindowOffset")
    public Long windowOffset;

    public static UpdateBimModelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimModelConfigRequest self = new UpdateBimModelConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimModelConfigRequest setBeamHeight(Long beamHeight) {
        this.beamHeight = beamHeight;
        return this;
    }
    public Long getBeamHeight() {
        return this.beamHeight;
    }

    public UpdateBimModelConfigRequest setBeamMode(Long beamMode) {
        this.beamMode = beamMode;
        return this;
    }
    public Long getBeamMode() {
        return this.beamMode;
    }

    public UpdateBimModelConfigRequest setBeamOffset(Long beamOffset) {
        this.beamOffset = beamOffset;
        return this;
    }
    public Long getBeamOffset() {
        return this.beamOffset;
    }

    public UpdateBimModelConfigRequest setDoorHeight(Long doorHeight) {
        this.doorHeight = doorHeight;
        return this;
    }
    public Long getDoorHeight() {
        return this.doorHeight;
    }

    public UpdateBimModelConfigRequest setDoorOffset(Long doorOffset) {
        this.doorOffset = doorOffset;
        return this;
    }
    public Long getDoorOffset() {
        return this.doorOffset;
    }

    public UpdateBimModelConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateBimModelConfigRequest setRoomMode(Long roomMode) {
        this.roomMode = roomMode;
        return this;
    }
    public Long getRoomMode() {
        return this.roomMode;
    }

    public UpdateBimModelConfigRequest setSlabMode(Long slabMode) {
        this.slabMode = slabMode;
        return this;
    }
    public Long getSlabMode() {
        return this.slabMode;
    }

    public UpdateBimModelConfigRequest setSlabThickness(Long slabThickness) {
        this.slabThickness = slabThickness;
        return this;
    }
    public Long getSlabThickness() {
        return this.slabThickness;
    }

    public UpdateBimModelConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimModelConfigRequest setWindowHeight(Long windowHeight) {
        this.windowHeight = windowHeight;
        return this;
    }
    public Long getWindowHeight() {
        return this.windowHeight;
    }

    public UpdateBimModelConfigRequest setWindowOffset(Long windowOffset) {
        this.windowOffset = windowOffset;
        return this;
    }
    public Long getWindowOffset() {
        return this.windowOffset;
    }

}
