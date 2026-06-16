// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StartCodeInterpreterSessionInput extends TeaModel {
    /**
     * <p>The name of the code interpreter session, used to identify and distinguish between different session instances</p>
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
