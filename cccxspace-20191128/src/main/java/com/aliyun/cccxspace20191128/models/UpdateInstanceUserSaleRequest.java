// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceUserSaleRequest extends TeaModel {
    @NameInMap("BuName")
    public String buName;

    @NameInMap("Email")
    public String email;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static UpdateInstanceUserSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceUserSaleRequest self = new UpdateInstanceUserSaleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceUserSaleRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public UpdateInstanceUserSaleRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateInstanceUserSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceUserSaleRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
