// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("UserUid")
    @Validation(required = true)
    public Long userUid;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    public static SetInstanceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceUserRequest self = new SetInstanceUserRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetInstanceUserRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public SetInstanceUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
