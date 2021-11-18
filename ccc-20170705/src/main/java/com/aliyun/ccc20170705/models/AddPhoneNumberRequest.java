// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneNumberRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Usage")
    public String usage;

    public static AddPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumberRequest self = new AddPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumberRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public AddPhoneNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddPhoneNumberRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
