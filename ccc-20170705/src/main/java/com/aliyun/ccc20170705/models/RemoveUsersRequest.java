// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemoveUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public java.util.List<String> userId;

    public static RemoveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersRequest self = new RemoveUsersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUsersRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

}
