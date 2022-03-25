// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimProjectDrawFilesShrinkRequest extends TeaModel {
    // 建筑
    @NameInMap("ArchitectureFiles")
    public String architectureFilesShrink;

    // 结构
    @NameInMap("StructureFiles")
    public String structureFilesShrink;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateBimProjectDrawFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimProjectDrawFilesShrinkRequest self = new UpdateBimProjectDrawFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimProjectDrawFilesShrinkRequest setArchitectureFilesShrink(String architectureFilesShrink) {
        this.architectureFilesShrink = architectureFilesShrink;
        return this;
    }
    public String getArchitectureFilesShrink() {
        return this.architectureFilesShrink;
    }

    public UpdateBimProjectDrawFilesShrinkRequest setStructureFilesShrink(String structureFilesShrink) {
        this.structureFilesShrink = structureFilesShrink;
        return this;
    }
    public String getStructureFilesShrink() {
        return this.structureFilesShrink;
    }

    public UpdateBimProjectDrawFilesShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
