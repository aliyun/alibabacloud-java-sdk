// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LifecycleRule extends TeaModel {
    @NameInMap("ArchiveDays")
    public Integer archiveDays;

    @NameInMap("BindCount")
    public Integer bindCount;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ColdArchiveDays")
    public Integer coldArchiveDays;

    @NameInMap("Config")
    public String config;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("IaDays")
    public Integer iaDays;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("ScheduleStatus")
    public String scheduleStatus;

    @NameInMap("Workflow")
    public Workflow workflow;

    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("WorkflowInstance")
    public WorkflowInstance workflowInstance;

    public static LifecycleRule build(java.util.Map<String, ?> map) throws Exception {
        LifecycleRule self = new LifecycleRule();
        return TeaModel.build(map, self);
    }

    public LifecycleRule setArchiveDays(Integer archiveDays) {
        this.archiveDays = archiveDays;
        return this;
    }
    public Integer getArchiveDays() {
        return this.archiveDays;
    }

    public LifecycleRule setBindCount(Integer bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Integer getBindCount() {
        return this.bindCount;
    }

    public LifecycleRule setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LifecycleRule setColdArchiveDays(Integer coldArchiveDays) {
        this.coldArchiveDays = coldArchiveDays;
        return this;
    }
    public Integer getColdArchiveDays() {
        return this.coldArchiveDays;
    }

    public LifecycleRule setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public LifecycleRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LifecycleRule setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public LifecycleRule setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public LifecycleRule setIaDays(Integer iaDays) {
        this.iaDays = iaDays;
        return this;
    }
    public Integer getIaDays() {
        return this.iaDays;
    }

    public LifecycleRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LifecycleRule setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public LifecycleRule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public LifecycleRule setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    public LifecycleRule setWorkflow(Workflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public Workflow getWorkflow() {
        return this.workflow;
    }

    public LifecycleRule setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public LifecycleRule setWorkflowInstance(WorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    public WorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

}
