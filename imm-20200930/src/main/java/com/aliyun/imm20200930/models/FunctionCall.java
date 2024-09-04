// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FunctionCall extends TeaModel {
    @NameInMap("Arguments")
    public String arguments;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static FunctionCall build(java.util.Map<String, ?> map) throws Exception {
        FunctionCall self = new FunctionCall();
        return TeaModel.build(map, self);
    }

    public FunctionCall setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public FunctionCall setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
