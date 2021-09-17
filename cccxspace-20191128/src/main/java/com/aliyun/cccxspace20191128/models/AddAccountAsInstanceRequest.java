// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddAccountAsInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    public static AddAccountAsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAccountAsInstanceRequest self = new AddAccountAsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddAccountAsInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddAccountAsInstanceRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}
