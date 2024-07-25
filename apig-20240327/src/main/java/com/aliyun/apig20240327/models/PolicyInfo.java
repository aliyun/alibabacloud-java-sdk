// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyInfo extends TeaModel {
    @NameInMap("attachments")
    public java.util.List<Attachment> attachments;

    @NameInMap("classAlias")
    public String classAlias;

    @NameInMap("className")
    public String className;

    @NameInMap("config")
    public String config;

    @NameInMap("direction")
    public String direction;

    @NameInMap("executePriority")
    public String executePriority;

    @NameInMap("executeStage")
    public String executeStage;

    @NameInMap("name")
    public String name;

    @NameInMap("policyId")
    public String policyId;

    @NameInMap("type")
    public String type;

    public static PolicyInfo build(java.util.Map<String, ?> map) throws Exception {
        PolicyInfo self = new PolicyInfo();
        return TeaModel.build(map, self);
    }

    public PolicyInfo setAttachments(java.util.List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }

    public PolicyInfo setClassAlias(String classAlias) {
        this.classAlias = classAlias;
        return this;
    }
    public String getClassAlias() {
        return this.classAlias;
    }

    public PolicyInfo setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public PolicyInfo setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public PolicyInfo setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public PolicyInfo setExecutePriority(String executePriority) {
        this.executePriority = executePriority;
        return this;
    }
    public String getExecutePriority() {
        return this.executePriority;
    }

    public PolicyInfo setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
        return this;
    }
    public String getExecuteStage() {
        return this.executeStage;
    }

    public PolicyInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PolicyInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public PolicyInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
