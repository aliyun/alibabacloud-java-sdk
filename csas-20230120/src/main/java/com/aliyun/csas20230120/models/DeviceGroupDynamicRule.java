// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeviceGroupDynamicRule extends TeaModel {
    /**
     * <p>The list of matching parameters. The meaning of the parameters is determined by both Key and Operator. When Key is set to dev_type and Operator is set to in, specify the operating system types to match.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;windows&quot;]</p>
     */
    @NameInMap("Args")
    public Object args;

    /**
     * <p>The user endpoint device property key used for dynamic matching. The example value dev_type indicates the operating system type of the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_type</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The matching operator applied to the property specified by Key. The example value in indicates that the property value belongs to the list of parameters specified by Args.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
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
