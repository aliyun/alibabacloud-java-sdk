// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddInstanceUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("RealName")
    public String realName;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Email")
    public String email;

    @NameInMap("BuName")
    public String buName;

    public static AddInstanceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceUserRequest self = new AddInstanceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddInstanceUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public AddInstanceUserRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AddInstanceUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddInstanceUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddInstanceUserRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

}
