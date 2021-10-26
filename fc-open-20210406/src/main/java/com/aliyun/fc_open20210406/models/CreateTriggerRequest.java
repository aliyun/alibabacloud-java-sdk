// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    // event source，如OSS，使用该role去invoke function
    @NameInMap("invocationRole")
    public String invocationRole;

    // service版本
    @NameInMap("qualifier")
    public String qualifier;

    // event source的Aliyun Resource Name（ARN
    @NameInMap("sourceArn")
    public String sourceArn;

    // trigger配置，针对不同的trigger类型，trigger配置会有所不同
    @NameInMap("triggerConfig")
    public String triggerConfig;

    // trigger名称
    @NameInMap("triggerName")
    public String triggerName;

    // trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
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
