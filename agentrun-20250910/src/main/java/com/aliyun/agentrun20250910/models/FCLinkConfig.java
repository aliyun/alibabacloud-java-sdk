// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FCLinkConfig extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("version")
    public String version;

    public static FCLinkConfig build(java.util.Map<String, ?> map) throws Exception {
        FCLinkConfig self = new FCLinkConfig();
        return TeaModel.build(map, self);
    }

    public FCLinkConfig setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public FCLinkConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
