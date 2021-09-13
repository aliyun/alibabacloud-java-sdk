// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Number")
    public String number;

    @NameInMap("Usage")
    public String usage;

    @NameInMap("ContactFlowId")
    public String contactFlowId;

    public static ModifyPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberRequest self = new ModifyPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPhoneNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ModifyPhoneNumberRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public ModifyPhoneNumberRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

}
