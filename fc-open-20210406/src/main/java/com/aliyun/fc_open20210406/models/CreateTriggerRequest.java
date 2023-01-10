// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    // The description of the trigger.
    @NameInMap("description")
    public String description;

    // The role that is used by the event source such as OSS to invoke the function. For more information, see [Overview](~~53102~~).
    @NameInMap("invocationRole")
    public String invocationRole;

    // The version or alias of the service.
    @NameInMap("qualifier")
    public String qualifier;

    // The Alibaba Cloud Resource Name (ARN) of the event source for the trigger.
    @NameInMap("sourceArn")
    public String sourceArn;

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

    // The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (\_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).
    @NameInMap("triggerName")
    public String triggerName;

    // The type of the trigger. Valid values:
    // 
    // *   **oss**: OSS event trigger. For more information, see [Overview](~~62922~~).
    // *   **log**: Log Service trigger. For more information, see [Overview](~~84386~~).
    // *   **timer**: time trigger. For more information, see [Overview](~~68172~~).
    // *   **http**: HTTP trigger. For more information, see [Overview](~~71229~~).
    // *   **tablestore**: Tablestore trigger. For more information, see [Overview](~~100092~~).
    // *   **cdn_events**: CDN event trigger. For more information, see [Overview](~~73333~~).
    // *   **mns_topic**: MNS topic trigger. For more information, see [Overview](~~97032~~).
    @NameInMap("triggerType")
    public String triggerType;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTriggerRequest setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public CreateTriggerRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public CreateTriggerRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public CreateTriggerRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateTriggerRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateTriggerRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
