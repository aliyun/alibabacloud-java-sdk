// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The version or alias of the service.</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:</p>
     * <br>
     * <p>*   OSS trigger: [OSSTriggerConfig](~~struct:OSSTriggerConfig~~).</p>
     * <p>*   Log Service trigger: [LogTriggerConfig](~~struct:LogTriggerConfig~~).</p>
     * <p>*   Time trigger: [TimeTriggerConfig](~~struct:TimeTriggerConfig~~).</p>
     * <p>*   HTTP trigger: [HTTPTriggerConfig](~~struct:HTTPTriggerConfig~~).</p>
     * <p>*   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.</p>
     * <p>*   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](~~struct:CDNEventsTriggerConfig~~).</p>
     * <p>*   MNS topic trigger: [MnsTopicTriggerConfig](~~struct:MnsTopicTriggerConfig~~).</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The description of the trigger.</p>
     */
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
