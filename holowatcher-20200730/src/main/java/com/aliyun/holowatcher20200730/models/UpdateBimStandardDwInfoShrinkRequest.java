// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardDwInfoShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    @NameInMap("Keys")
    public String keysShrink;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateBimStandardDwInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardDwInfoShrinkRequest self = new UpdateBimStandardDwInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardDwInfoShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public UpdateBimStandardDwInfoShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public UpdateBimStandardDwInfoShrinkRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardDwInfoShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
