// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeviceGroupDynamicRule extends TeaModel {
    @NameInMap("Args")
    public Object args;

    @NameInMap("Key")
    public String key;

    @NameInMap("Operator")
    public String operator;

    public static DeviceGroupDynamicRule build(java.util.Map<String, ?> map) throws Exception {
        DeviceGroupDynamicRule self = new DeviceGroupDynamicRule();
        return TeaModel.build(map, self);
    }

    public DeviceGroupDynamicRule setArgs(Object args) {
        this.args = args;
        return this;
    }
    public Object getArgs() {
        return this.args;
    }

    public DeviceGroupDynamicRule setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeviceGroupDynamicRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
