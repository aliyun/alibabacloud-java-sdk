// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateTriggerInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("invocationRole")
    public String invocationRole;

    @NameInMap("qualifier")
    public String qualifier;

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
