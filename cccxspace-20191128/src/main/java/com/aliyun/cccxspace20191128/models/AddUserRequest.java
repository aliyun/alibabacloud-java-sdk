// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    @NameInMap("BuName")
    public String buName;

    @NameInMap("Email")
    public String email;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("RealName")
    public String realName;

    public static AddUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserRequest self = new AddUserRequest();
        return TeaModel.build(map, self);
    }

    public AddUserRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public AddUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public AddUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddUserRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

}
