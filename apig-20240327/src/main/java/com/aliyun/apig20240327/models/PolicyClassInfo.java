// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyClassInfo extends TeaModel {
    /**
     * <p>The alias of the policy template.</p>
     * 
     * <strong>example:</strong>
     * <p>Concurrency Control</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The list of resource types that can be mounted.</p>
     */
    @NameInMap("attachableResourceTypes")
    public java.util.List<String> attachableResourceTypes;

    /**
     * <p>The identifier of the policy template.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-cpqm0s94ckt1displ8ng</p>
     */
    @NameInMap("classId")
    public String classId;

    /**
     * <p>The configuration example.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("configExample")
    public String configExample;

    /**
     * <p>Indicates whether the policy is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deprecated")
    public Boolean deprecated;

    /**
     * <p>The detailed description of the policy template.</p>
     * 
     * <strong>example:</strong>
     * <p>Controls the number of concurrent threads to ensure system stability. Applicable to scenarios where internal application components or downstream dependencies become unstable, such as slow SQL queries or increased response time from downstream applications</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The direction in which the policy takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>Indicates whether log recording is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableLog")
    public Boolean enableLog;

    /**
     * <p>The execution priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("executePriority")
    public String executePriority;

    /**
     * <p>The execution stage.</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("executeStage")
    public String executeStage;

    /**
     * <p>The name of the policy template.</p>
     * 
     * <strong>example:</strong>
     * <p>ConcurrencyLimit</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowControl</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The version of the policy template.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
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
