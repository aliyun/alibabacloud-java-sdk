// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>A list of number tag names. You must provide the complete list of number tags to be modified, and ensure that these number tags have already been created.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TagA&quot;,&quot;TagB&quot;]</p>
     */
    @NameInMap("CallTagNameList")
    public String callTagNameList;

    /**
     * <p>The new description for the inbound number mark. This parameter is optional. The default value is empty, which indicates that the description will not be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number associated with the inbound number mark. The system matches the inbound number mark to be modified based on this number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1312121****</p>
     */
    @NameInMap("Number")
    public String number;

    public static ModifyCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomCallTaggingRequest self = new ModifyCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomCallTaggingRequest setCallTagNameList(String callTagNameList) {
        this.callTagNameList = callTagNameList;
        return this;
    }
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    public ModifyCustomCallTaggingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCustomCallTaggingRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
