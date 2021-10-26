// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    // event source，如OSS，使用该role去invoke function
    @NameInMap("invocationRole")
    public String invocationRole;

    // service版本
    @NameInMap("qualifier")
    public String qualifier;

    // trigger配置，针对不同的trigger类型，trigger配置会有所不同	
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
