// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardElevationShrinkRequest extends TeaModel {
    @NameInMap("Floors")
    public String floorsShrink;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TerraceHeight")
    public Double terraceHeight;

    public static UpdateBimStandardElevationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardElevationShrinkRequest self = new UpdateBimStandardElevationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardElevationShrinkRequest setFloorsShrink(String floorsShrink) {
        this.floorsShrink = floorsShrink;
        return this;
    }
    public String getFloorsShrink() {
        return this.floorsShrink;
    }

    public UpdateBimStandardElevationShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateBimStandardElevationShrinkRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardElevationShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimStandardElevationShrinkRequest setTerraceHeight(Double terraceHeight) {
        this.terraceHeight = terraceHeight;
        return this;
    }
    public Double getTerraceHeight() {
        return this.terraceHeight;
    }

}
