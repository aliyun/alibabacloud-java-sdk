// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserUid")
    public String userUid;

    @NameInMap("UserName")
    public String userName;

    public static SetGWSInstanceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGWSInstanceUserRequest self = new SetGWSInstanceUserRequest();
        return TeaModel.build(map, self);
    }

    public SetGWSInstanceUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetGWSInstanceUserRequest setUserUid(String userUid) {
        this.userUid = userUid;
        return this;
    }
    public String getUserUid() {
        return this.userUid;
    }

    public SetGWSInstanceUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
