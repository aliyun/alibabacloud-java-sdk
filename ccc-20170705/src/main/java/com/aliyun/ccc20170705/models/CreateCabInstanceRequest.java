// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateCabInstanceRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    @NameInMap("CallCenterInstanceId")
    public String callCenterInstanceId;

    public static CreateCabInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCabInstanceRequest self = new CreateCabInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCabInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateCabInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateCabInstanceRequest setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public CreateCabInstanceRequest setCallCenterInstanceId(String callCenterInstanceId) {
        this.callCenterInstanceId = callCenterInstanceId;
        return this;
    }
    public String getCallCenterInstanceId() {
        return this.callCenterInstanceId;
    }

}
