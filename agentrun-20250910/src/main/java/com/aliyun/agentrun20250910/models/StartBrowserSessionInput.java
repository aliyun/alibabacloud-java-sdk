// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StartBrowserSessionInput extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("name")
    public String name;

    public static StartBrowserSessionInput build(java.util.Map<String, ?> map) throws Exception {
        StartBrowserSessionInput self = new StartBrowserSessionInput();
        return TeaModel.build(map, self);
    }

    public StartBrowserSessionInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
