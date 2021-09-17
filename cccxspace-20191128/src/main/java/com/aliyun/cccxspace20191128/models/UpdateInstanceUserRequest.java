// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Email")
    public String email;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("BuName")
    public String buName;

    public static UpdateInstanceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceUserRequest self = new UpdateInstanceUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateInstanceUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateInstanceUserRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

}
