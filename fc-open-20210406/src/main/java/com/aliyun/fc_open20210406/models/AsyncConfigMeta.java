// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class AsyncConfigMeta extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("serviceName")
    public String serviceName;

    public static AsyncConfigMeta build(java.util.Map<String, ?> map) throws Exception {
        AsyncConfigMeta self = new AsyncConfigMeta();
        return TeaModel.build(map, self);
    }

    public AsyncConfigMeta setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public AsyncConfigMeta setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public AsyncConfigMeta setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
