// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPhoneNumbersRequest extends TeaModel {
    /**
     * <p>ID of the IVR contact flow to attach. This parameter is valid only when the number usage includes inbound calls. It is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>dDMD_0mif4hv</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Number group ID. You can view number grouping information in the Cloud Contact Center console. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>2cb77c29-5f60-4b90-b21e-9d2ba9833f14</p>
     */
    @NameInMap("NumberGroupId")
    public String numberGroupId;

    /**
     * <p>List of phone numbers to add.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;0101234****&quot;, &quot;0105678****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>Usage of the phone number. Note: If the provided number is a 400 number, the usage must be set to Inbound.</p>
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
