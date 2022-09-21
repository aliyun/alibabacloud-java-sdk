// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfig extends TeaModel {
    @NameInMap("ConfigAction")
    public String configAction;

    @NameInMap("ConfigDescription")
    public String configDescription;

    @NameInMap("ConfigFileName")
    public String configFileName;

    @NameInMap("ConfigItemKey")
    public String configItemKey;

    @NameInMap("ConfigItemValue")
    public String configItemValue;

    @NameInMap("ConfigScope")
    public String configScope;

    @NameInMap("EffectiveActions")
    public String effectiveActions;

    @NameInMap("EffectiveType")
    public String effectiveType;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeId")
    public String nodeId;

    public static UpdateApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfig self = new UpdateApplicationConfig();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfig setConfigAction(String configAction) {
        this.configAction = configAction;
        return this;
    }
    public String getConfigAction() {
        return this.configAction;
    }

    public UpdateApplicationConfig setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
        return this;
    }
    public String getConfigDescription() {
        return this.configDescription;
    }

    public UpdateApplicationConfig setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public UpdateApplicationConfig setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public UpdateApplicationConfig setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public UpdateApplicationConfig setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public UpdateApplicationConfig setEffectiveActions(String effectiveActions) {
        this.effectiveActions = effectiveActions;
        return this;
    }
    public String getEffectiveActions() {
        return this.effectiveActions;
    }

    public UpdateApplicationConfig setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }
    public String getEffectiveType() {
        return this.effectiveType;
    }

    public UpdateApplicationConfig setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateApplicationConfig setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
