// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumberId")
    public String phoneNumberId;

    public static RemovePhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumberRequest self = new RemovePhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePhoneNumberRequest setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

}
