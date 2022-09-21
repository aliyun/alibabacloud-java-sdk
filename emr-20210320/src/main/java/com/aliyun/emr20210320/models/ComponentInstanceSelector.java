// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ComponentInstanceSelector extends TeaModel {
    @NameInMap("ActionScope")
    public String actionScope;

    @NameInMap("ApplicationNames")
    public java.util.List<String> applicationNames;

    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    @NameInMap("Components")
    public java.util.List<Components> components;

    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    @NameInMap("RunActionScope")
    public String runActionScope;

    public static ComponentInstanceSelector build(java.util.Map<String, ?> map) throws Exception {
        ComponentInstanceSelector self = new ComponentInstanceSelector();
        return TeaModel.build(map, self);
    }

    public ComponentInstanceSelector setActionScope(String actionScope) {
        this.actionScope = actionScope;
        return this;
    }
    public String getActionScope() {
        return this.actionScope;
    }

    public ComponentInstanceSelector setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ComponentInstanceSelector setComponentInstances(java.util.List<ComponentInstances> componentInstances) {
        this.componentInstances = componentInstances;
        return this;
    }
    public java.util.List<ComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    public ComponentInstanceSelector setComponents(java.util.List<Components> components) {
        this.components = components;
        return this;
    }
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    public ComponentInstanceSelector setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public ComponentInstanceSelector setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ComponentInstanceSelector setRunActionScope(String runActionScope) {
        this.runActionScope = runActionScope;
        return this;
    }
    public String getRunActionScope() {
        return this.runActionScope;
    }

    public static class ComponentInstances extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("NodeId")
        public String nodeId;

        public static ComponentInstances build(java.util.Map<String, ?> map) throws Exception {
            ComponentInstances self = new ComponentInstances();
            return TeaModel.build(map, self);
        }

        public ComponentInstances setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ComponentInstances setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ComponentInstances setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class Components extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ComponentName")
        public String componentName;

        public static Components build(java.util.Map<String, ?> map) throws Exception {
            Components self = new Components();
            return TeaModel.build(map, self);
        }

        public Components setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Components setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

    }

}
