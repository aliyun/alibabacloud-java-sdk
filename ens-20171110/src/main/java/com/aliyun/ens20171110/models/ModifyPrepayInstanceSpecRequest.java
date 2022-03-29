// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    // 变配实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 更新的配置
    @NameInMap("InstanceType")
    public String instanceType;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayInstanceSpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
