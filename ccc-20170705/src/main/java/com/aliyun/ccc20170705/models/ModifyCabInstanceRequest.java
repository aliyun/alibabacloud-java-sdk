// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyCabInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    @NameInMap("CallCenterInstanceId")
    public String callCenterInstanceId;

    public static ModifyCabInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCabInstanceRequest self = new ModifyCabInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCabInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCabInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyCabInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyCabInstanceRequest setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public ModifyCabInstanceRequest setCallCenterInstanceId(String callCenterInstanceId) {
        this.callCenterInstanceId = callCenterInstanceId;
        return this;
    }
    public String getCallCenterInstanceId() {
        return this.callCenterInstanceId;
    }

}
