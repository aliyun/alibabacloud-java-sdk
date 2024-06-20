// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>78128960-bb00-4ddc-8a82-923a8c5bd22d</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0102134****</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bidirection</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static ModifyPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberRequest self = new ModifyPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
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

}
