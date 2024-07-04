// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfigParam extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DELETE</p>
     */
    @NameInMap("ConfigAction")
    public String configAction;

    /**
     * <strong>example:</strong>
     * <p>hdfs-site.xml</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <strong>example:</strong>
     * <p>namenode checkpoint period</p>
     */
    @NameInMap("ConfigItemDescription")
    public String configItemDescription;

    /**
     * <strong>example:</strong>
     * <p>dfs.namenode.checkpoint.period</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <strong>example:</strong>
     * <p>3600s</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <strong>example:</strong>
     * <p>RESTART</p>
     */
    @NameInMap("EffectiveActions")
    public String effectiveActions;

    /**
     * <strong>example:</strong>
     * <p>MANUAL</p>
     */
    @NameInMap("EffectiveType")
    public String effectiveType;

    /**
     * <strong>example:</strong>
     * <p>G-DE1CF4661E09****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>i-bp10h9rezawz1i4o****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static ApplicationConfigParam build(java.util.Map<String, ?> map) throws Exception {
        ApplicationConfigParam self = new ApplicationConfigParam();
        return TeaModel.build(map, self);
    }

    public ApplicationConfigParam setConfigAction(String configAction) {
        this.configAction = configAction;
        return this;
    }
    public String getConfigAction() {
        return this.configAction;
    }

    public ApplicationConfigParam setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ApplicationConfigParam setConfigItemDescription(String configItemDescription) {
        this.configItemDescription = configItemDescription;
        return this;
    }
    public String getConfigItemDescription() {
        return this.configItemDescription;
    }

    public ApplicationConfigParam setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ApplicationConfigParam setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public ApplicationConfigParam setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public ApplicationConfigParam setEffectiveActions(String effectiveActions) {
        this.effectiveActions = effectiveActions;
        return this;
    }
    public String getEffectiveActions() {
        return this.effectiveActions;
    }

    public ApplicationConfigParam setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }
    public String getEffectiveType() {
        return this.effectiveType;
    }

    public ApplicationConfigParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ApplicationConfigParam setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
