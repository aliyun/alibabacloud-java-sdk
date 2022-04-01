// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class AsyncConfigMeta extends TeaModel {
    // 异步配置所属函数名称。
    @NameInMap("functionName")
    public String functionName;

    // 异步配置所属服务版本/别名。
    @NameInMap("qualifier")
    public String qualifier;

    // 异步配置所属服务名称。
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
