// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyClassInfo extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("attachableResourceTypes")
    public java.util.List<String> attachableResourceTypes;

    @NameInMap("classId")
    public String classId;

    @NameInMap("configExample")
    public String configExample;

    @NameInMap("deprecated")
    public Boolean deprecated;

    @NameInMap("description")
    public String description;

    @NameInMap("direction")
    public String direction;

    @NameInMap("enableLog")
    public Boolean enableLog;

    @NameInMap("executePriority")
    public String executePriority;

    @NameInMap("executeStage")
    public String executeStage;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static PolicyClassInfo build(java.util.Map<String, ?> map) throws Exception {
        PolicyClassInfo self = new PolicyClassInfo();
        return TeaModel.build(map, self);
    }

    public PolicyClassInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PolicyClassInfo setAttachableResourceTypes(java.util.List<String> attachableResourceTypes) {
        this.attachableResourceTypes = attachableResourceTypes;
        return this;
    }
    public java.util.List<String> getAttachableResourceTypes() {
        return this.attachableResourceTypes;
    }

    public PolicyClassInfo setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public PolicyClassInfo setConfigExample(String configExample) {
        this.configExample = configExample;
        return this;
    }
    public String getConfigExample() {
        return this.configExample;
    }

    public PolicyClassInfo setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    public Boolean getDeprecated() {
        return this.deprecated;
    }

    public PolicyClassInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PolicyClassInfo setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public PolicyClassInfo setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
        return this;
    }
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    public PolicyClassInfo setExecutePriority(String executePriority) {
        this.executePriority = executePriority;
        return this;
    }
    public String getExecutePriority() {
        return this.executePriority;
    }

    public PolicyClassInfo setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
        return this;
    }
    public String getExecuteStage() {
        return this.executeStage;
    }

    public PolicyClassInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PolicyClassInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PolicyClassInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
