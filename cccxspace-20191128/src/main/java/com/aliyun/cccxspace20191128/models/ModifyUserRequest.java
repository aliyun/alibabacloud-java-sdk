// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ModifyUserRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Email")
    public String email;

    @NameInMap("BuName")
    public String buName;

    public static ModifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserRequest self = new ModifyUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ModifyUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ModifyUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyUserRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

}
