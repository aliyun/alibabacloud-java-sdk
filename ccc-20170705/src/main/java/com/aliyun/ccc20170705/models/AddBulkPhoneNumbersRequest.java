// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddBulkPhoneNumbersRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumber")
    public java.util.List<String> phoneNumber;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("Usage")
    public String usage;

    public static AddBulkPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBulkPhoneNumbersRequest self = new AddBulkPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public AddBulkPhoneNumbersRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public AddBulkPhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddBulkPhoneNumbersRequest setPhoneNumber(java.util.List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public java.util.List<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddBulkPhoneNumbersRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public AddBulkPhoneNumbersRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
