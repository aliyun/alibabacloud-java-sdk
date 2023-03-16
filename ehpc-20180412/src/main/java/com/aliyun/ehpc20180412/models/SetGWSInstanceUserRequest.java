// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceUserRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserUid")
    public String userUid;

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

    public SetGWSInstanceUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SetGWSInstanceUserRequest setUserUid(String userUid) {
        this.userUid = userUid;
        return this;
    }
    public String getUserUid() {
        return this.userUid;
    }

}
