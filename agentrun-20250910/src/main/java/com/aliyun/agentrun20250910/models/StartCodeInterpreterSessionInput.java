// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StartCodeInterpreterSessionInput extends TeaModel {
    /**
     * <p>代码解释器会话的名称，用于标识和区分不同的会话实例</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("name")
    public String name;

    public static StartCodeInterpreterSessionInput build(java.util.Map<String, ?> map) throws Exception {
        StartCodeInterpreterSessionInput self = new StartCodeInterpreterSessionInput();
        return TeaModel.build(map, self);
    }

    public StartCodeInterpreterSessionInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
