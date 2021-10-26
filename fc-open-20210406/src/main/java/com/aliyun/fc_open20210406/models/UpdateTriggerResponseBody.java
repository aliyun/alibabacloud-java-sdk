// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerResponseBody extends TeaModel {
    // 创建时间
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    // 调用函数使用的RAM角色的ARN
    @NameInMap("invocationRole")
    public String invocationRole;

    // 上次修改时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // service版本
    @NameInMap("qualifier")
    public String qualifier;

    // event source的Aliyun Resource Name（ARN
    @NameInMap("sourceArn")
    public String sourceArn;

    // trigger配置对象
    @NameInMap("triggerConfig")
    public String triggerConfig;

    @NameInMap("triggerId")
    public String triggerId;

    // trigger名称
    @NameInMap("triggerName")
    public String triggerName;

    // trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
    @NameInMap("triggerType")
    public String triggerType;

    public static UpdateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerResponseBody self = new UpdateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateTriggerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerResponseBody setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateTriggerResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public UpdateTriggerResponseBody setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public UpdateTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public UpdateTriggerResponseBody setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateTriggerResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
