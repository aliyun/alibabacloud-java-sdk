// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateTriggerInput extends TeaModel {
    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The role that is used by the event source such as object Storage Service (OSS) to invoke the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/fc-test</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The version or alias of the service to which the function belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The configuration of the trigger. The configuration vary based on the trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;:[&quot;oss:ObjectCreated:*&quot;],&quot;filter&quot;:{&quot;key&quot;:{&quot;prefix&quot;:&quot;/prefix&quot;,&quot;suffix&quot;:&quot;.zip&quot;}}}</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    public static UpdateTriggerInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerInput self = new UpdateTriggerInput();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerInput setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerInput setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerInput setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

}
