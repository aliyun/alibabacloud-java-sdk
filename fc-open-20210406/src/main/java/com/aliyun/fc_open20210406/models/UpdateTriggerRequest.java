// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    // The description of the trigger.
    @NameInMap("description")
    public String description;

    // The role that is used by the event source such as OSS to invoke the function. For more information, see [Overview](~~53102~~).
    @NameInMap("invocationRole")
    public String invocationRole;

    // The version or alias of the service.
    @NameInMap("qualifier")
    public String qualifier;

    // The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:
    // 
    // *   OSS trigger: [OSSTriggerConfig](javascript:void\(0\)).
    // *   Log Service trigger: [LogTriggerConfig](javascript:void\(0\)).
    // *   Time trigger: [TimeTriggerConfig](javascript:void\(0\)).
    // *   HTTP trigger: [HTTPTriggerConfig](javascript:void\(0\)).
    // *   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.
    // *   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](javascript:void\(0\)).
    // *   MNS topic trigger: [MnsTopicTriggerConfig](javascript:void\(0\)).
    @NameInMap("triggerConfig")
    public String triggerConfig;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerRequest setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

}
