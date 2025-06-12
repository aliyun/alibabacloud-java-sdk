// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WorkflowParameter extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    public static WorkflowParameter build(java.util.Map<String, ?> map) throws Exception {
        WorkflowParameter self = new WorkflowParameter();
        return TeaModel.build(map, self);
    }

    public WorkflowParameter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkflowParameter setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
