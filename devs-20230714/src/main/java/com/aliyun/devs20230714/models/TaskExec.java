// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskExec extends TeaModel {
    @NameInMap("context")
    public Context context;

    @NameInMap("name")
    public String name;

    @NameInMap("runAfters")
    public java.util.List<RunAfter> runAfters;

    @NameInMap("taskTemplate")
    public String taskTemplate;

    public static TaskExec build(java.util.Map<String, ?> map) throws Exception {
        TaskExec self = new TaskExec();
        return TeaModel.build(map, self);
    }

    public TaskExec setContext(Context context) {
        this.context = context;
        return this;
    }
    public Context getContext() {
        return this.context;
    }

    public TaskExec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TaskExec setRunAfters(java.util.List<RunAfter> runAfters) {
        this.runAfters = runAfters;
        return this;
    }
    public java.util.List<RunAfter> getRunAfters() {
        return this.runAfters;
    }

    public TaskExec setTaskTemplate(String taskTemplate) {
        this.taskTemplate = taskTemplate;
        return this;
    }
    public String getTaskTemplate() {
        return this.taskTemplate;
    }

}
