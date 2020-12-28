// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceNameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    public static SetGWSInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGWSInstanceNameRequest self = new SetGWSInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public SetGWSInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetGWSInstanceNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
