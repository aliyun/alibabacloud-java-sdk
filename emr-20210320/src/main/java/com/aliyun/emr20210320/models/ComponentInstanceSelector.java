// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ComponentInstanceSelector extends TeaModel {
    @NameInMap("ActionScope")
    @Deprecated
    public String actionScope;

    /**
     * <p>应用名称。</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>组件实例列表。actionScope为COPONENT_INSTANCE时使用。</p>
     */
    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    /**
     * <p>组件列表。</p>
     * <p>actionScope为COPONENT时使用。</p>
     */
    @NameInMap("Components")
    public java.util.List<Components> components;

    /**
     * <p>动作执行范围。取值范围：</p>
     * <p>- APPLICATION：应用级别。</p>
     * <p>- COMPONENT：组件级别。</p>
     * <p>- COMPONENT_INSTANCE：组件实例级别。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public ComponentInstanceSelector setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
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

    public ComponentInstanceSelector setRunActionScope(String runActionScope) {
        this.runActionScope = runActionScope;
        return this;
    }
    public String getRunActionScope() {
        return this.runActionScope;
    }

    public static class ComponentInstances extends TeaModel {
        /**
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>组件名称。</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>节点ID。</p>
         */
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
        /**
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>组件名称。</p>
         */
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
