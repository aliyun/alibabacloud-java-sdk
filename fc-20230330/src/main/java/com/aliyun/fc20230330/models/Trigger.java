// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Trigger extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("httpTrigger")
    public HTTPTrigger httpTrigger;

    @NameInMap("invocationRole")
    public String invocationRole;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("sourceArn")
    public String sourceArn;

    @NameInMap("status")
    public String status;

    @NameInMap("targetArn")
    public String targetArn;

    @NameInMap("triggerConfig")
    public String triggerConfig;

    @NameInMap("triggerId")
    public String triggerId;

    @NameInMap("triggerName")
    public String triggerName;

    @NameInMap("triggerType")
    public String triggerType;

    public static Trigger build(java.util.Map<String, ?> map) throws Exception {
        Trigger self = new Trigger();
        return TeaModel.build(map, self);
    }

    public Trigger setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Trigger setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Trigger setHttpTrigger(HTTPTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public HTTPTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public Trigger setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public Trigger setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Trigger setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public Trigger setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public Trigger setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Trigger setTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }
    public String getTargetArn() {
        return this.targetArn;
    }

    public Trigger setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public Trigger setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public Trigger setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public Trigger setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
