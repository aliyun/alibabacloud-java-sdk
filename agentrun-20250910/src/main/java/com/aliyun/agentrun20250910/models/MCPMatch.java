// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPMatch extends TeaModel {
    @NameInMap("path")
    public MCPPathMatch path;

    public static MCPMatch build(java.util.Map<String, ?> map) throws Exception {
        MCPMatch self = new MCPMatch();
        return TeaModel.build(map, self);
    }

    public MCPMatch setPath(MCPPathMatch path) {
        this.path = path;
        return this;
    }
    public MCPPathMatch getPath() {
        return this.path;
    }

}
