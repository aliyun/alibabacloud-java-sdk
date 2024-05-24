// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTemplateSpec extends TeaModel {
    @NameInMap("context")
    public Context context;

    @NameInMap("tasks")
    public java.util.List<TaskExec> tasks;

    public static PipelineTemplateSpec build(java.util.Map<String, ?> map) throws Exception {
        PipelineTemplateSpec self = new PipelineTemplateSpec();
        return TeaModel.build(map, self);
    }

    public PipelineTemplateSpec setContext(Context context) {
        this.context = context;
        return this;
    }
    public Context getContext() {
        return this.context;
    }

    public PipelineTemplateSpec setTasks(java.util.List<TaskExec> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<TaskExec> getTasks() {
        return this.tasks;
    }

}
