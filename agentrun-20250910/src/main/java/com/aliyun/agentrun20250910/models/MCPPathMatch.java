// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPPathMatch extends TeaModel {
    @NameInMap("type")
    public String type;

    @NameInMap("value")
    public String value;

    public static MCPPathMatch build(java.util.Map<String, ?> map) throws Exception {
        MCPPathMatch self = new MCPPathMatch();
        return TeaModel.build(map, self);
    }

    public MCPPathMatch setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MCPPathMatch setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
