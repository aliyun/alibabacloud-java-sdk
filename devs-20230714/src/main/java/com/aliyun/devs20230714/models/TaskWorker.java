// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskWorker extends TeaModel {
    @NameInMap("presetWorker")
    public String presetWorker;

    public static TaskWorker build(java.util.Map<String, ?> map) throws Exception {
        TaskWorker self = new TaskWorker();
        return TeaModel.build(map, self);
    }

    public TaskWorker setPresetWorker(String presetWorker) {
        this.presetWorker = presetWorker;
        return this;
    }
    public String getPresetWorker() {
        return this.presetWorker;
    }

}
