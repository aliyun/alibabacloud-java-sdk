// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTriggerInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("invocationRole")
    public String invocationRole;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("sourceArn")
    public String sourceArn;

    @NameInMap("triggerConfig")
    public String triggerConfig;

    @NameInMap("triggerName")
    public String triggerName;

    @NameInMap("triggerType")
    public String triggerType;

    public static CreateTriggerInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerInput self = new CreateTriggerInput();
        return TeaModel.build(map, self);
    }

    public CreateTriggerInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTriggerInput setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public CreateTriggerInput setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public CreateTriggerInput setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public CreateTriggerInput setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateTriggerInput setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateTriggerInput setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
