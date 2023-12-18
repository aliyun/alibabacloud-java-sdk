// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    /**
     * <p>The description of the trigger.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The role that is used by the event source such as OSS to invoke the function. For more information, see [Overview](~~53102~~).</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The version or alias of the service.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event source for the trigger.</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:</p>
     * <br>
     * <p>* OSS trigger: [OSSTriggerConfig](~~415697~~).</p>
     * <p>* Log Service trigger: [LogTriggerConfig](~~415694~~).</p>
     * <p>* Time trigger: [TimeTriggerConfig](~~415712~~).</p>
     * <p>* HTTP trigger: [HTTPTriggerConfig](~~415685~~).</p>
     * <p>* Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.</p>
     * <p>* Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](~~415674~~).</p>
     * <p>* MNS topic trigger: [MnsTopicTriggerConfig](~~415695~~).</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    /**
     * <p>The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (\_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).</p>
     */
    @NameInMap("triggerName")
    public String triggerName;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <br>
     * <p>*   **oss**: OSS event trigger. For more information, see [Overview](~~62922~~).</p>
     * <p>*   **log**: Log Service trigger. For more information, see [Overview](~~84386~~).</p>
     * <p>*   **timer**: time trigger. For more information, see [Overview](~~68172~~).</p>
     * <p>*   **http**: HTTP trigger. For more information, see [Overview](~~71229~~).</p>
     * <p>*   **tablestore**: Tablestore trigger. For more information, see [Overview](~~100092~~).</p>
     * <p>*   **cdn_events**: CDN event trigger. For more information, see [Overview](~~73333~~).</p>
     * <p>*   **mns_topic**: MNS topic trigger. For more information, see [Overview](~~97032~~).</p>
     */
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
