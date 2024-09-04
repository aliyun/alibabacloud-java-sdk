// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ToolCall extends TeaModel {
    @NameInMap("Function")
    public FunctionCall function;

    @NameInMap("Type")
    public String type;

    public static ToolCall build(java.util.Map<String, ?> map) throws Exception {
        ToolCall self = new ToolCall();
        return TeaModel.build(map, self);
    }

    public ToolCall setFunction(FunctionCall function) {
        this.function = function;
        return this;
    }
    public FunctionCall getFunction() {
        return this.function;
    }

    public ToolCall setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
