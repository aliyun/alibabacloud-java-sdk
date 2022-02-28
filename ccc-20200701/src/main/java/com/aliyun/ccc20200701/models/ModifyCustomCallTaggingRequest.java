// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCustomCallTaggingRequest extends TeaModel {
    @NameInMap("CallTagNameList")
    public String callTagNameList;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

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
