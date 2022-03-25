// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardSlabInfoShrinkRequest extends TeaModel {
    @NameInMap("Legends")
    public String legendsShrink;

    @NameInMap("RootDir")
    public String rootDir;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Thickness")
    public Long thickness;

    public static UpdateBimStandardSlabInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardSlabInfoShrinkRequest self = new UpdateBimStandardSlabInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardSlabInfoShrinkRequest setLegendsShrink(String legendsShrink) {
        this.legendsShrink = legendsShrink;
        return this;
    }
    public String getLegendsShrink() {
        return this.legendsShrink;
    }

    public UpdateBimStandardSlabInfoShrinkRequest setRootDir(String rootDir) {
        this.rootDir = rootDir;
        return this;
    }
    public String getRootDir() {
        return this.rootDir;
    }

    public UpdateBimStandardSlabInfoShrinkRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardSlabInfoShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimStandardSlabInfoShrinkRequest setThickness(Long thickness) {
        this.thickness = thickness;
        return this;
    }
    public Long getThickness() {
        return this.thickness;
    }

}
