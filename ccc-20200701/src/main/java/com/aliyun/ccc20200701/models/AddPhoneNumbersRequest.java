// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPhoneNumbersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dDMD_0mif4hv</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>2cb77c29-5f60-4b90-b21e-9d2ba9833f14</p>
     */
    @NameInMap("NumberGroupId")
    public String numberGroupId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;0101234****&quot;, &quot;0105678****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bidirection</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static AddPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumbersRequest self = new AddPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumbersRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public AddPhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPhoneNumbersRequest setNumberGroupId(String numberGroupId) {
        this.numberGroupId = numberGroupId;
        return this;
    }
    public String getNumberGroupId() {
        return this.numberGroupId;
    }

    public AddPhoneNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public AddPhoneNumbersRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
