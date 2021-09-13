// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPhoneNumbersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("Usage")
    public String usage;

    @NameInMap("NumberList")
    public String numberList;

    @NameInMap("NumberGroupId")
    public String numberGroupId;

    public static AddPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumbersRequest self = new AddPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPhoneNumbersRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public AddPhoneNumbersRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public AddPhoneNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public AddPhoneNumbersRequest setNumberGroupId(String numberGroupId) {
        this.numberGroupId = numberGroupId;
        return this;
    }
    public String getNumberGroupId() {
        return this.numberGroupId;
    }

}
