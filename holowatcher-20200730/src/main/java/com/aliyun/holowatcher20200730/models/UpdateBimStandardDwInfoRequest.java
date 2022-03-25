// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardDwInfoRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    @NameInMap("Keys")
    public java.util.List<String> keys;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateBimStandardDwInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardDwInfoRequest self = new UpdateBimStandardDwInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardDwInfoRequest setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public UpdateBimStandardDwInfoRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public UpdateBimStandardDwInfoRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardDwInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
