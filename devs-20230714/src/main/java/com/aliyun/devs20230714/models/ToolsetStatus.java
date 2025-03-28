// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetStatus extends TeaModel {
    @NameInMap("tools")
    public java.util.Map<String, Tool> tools;

    public static ToolsetStatus build(java.util.Map<String, ?> map) throws Exception {
        ToolsetStatus self = new ToolsetStatus();
        return TeaModel.build(map, self);
    }

    public ToolsetStatus setTools(java.util.Map<String, Tool> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.Map<String, Tool> getTools() {
        return this.tools;
    }

}
