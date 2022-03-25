// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardElevationRequest extends TeaModel {
    @NameInMap("Floors")
    public java.util.List<java.util.Map<String, ?>> floors;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TerraceHeight")
    public Double terraceHeight;

    public static UpdateBimStandardElevationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardElevationRequest self = new UpdateBimStandardElevationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardElevationRequest setFloors(java.util.List<java.util.Map<String, ?>> floors) {
        this.floors = floors;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getFloors() {
        return this.floors;
    }

    public UpdateBimStandardElevationRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateBimStandardElevationRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardElevationRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimStandardElevationRequest setTerraceHeight(Double terraceHeight) {
        this.terraceHeight = terraceHeight;
        return this;
    }
    public Double getTerraceHeight() {
        return this.terraceHeight;
    }

}
