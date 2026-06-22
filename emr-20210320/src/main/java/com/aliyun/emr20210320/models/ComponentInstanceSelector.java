// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ComponentInstanceSelector extends TeaModel {
    /**
     * <p>The action scope. Valid values:</p>
     * <ul>
     * <li><p>APPLICATION: The application level.</p>
     * </li>
     * <li><p>COMPONENT: The component level.</p>
     * </li>
     * <li><p>COMPONENT_INSTANCE: The component instance level.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("ActionScope")
    @Deprecated
    public String actionScope;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>A list of component instances. This parameter is used when <code>RunActionScope</code> is set to <code>COMPONENT_INSTANCE</code>.</p>
     */
    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    /**
     * <p>A list of components. This parameter is used when <code>RunActionScope</code> is set to <code>COMPONENT</code>.</p>
     */
    @NameInMap("Components")
    public java.util.List<Components> components;

    /**
     * <p>The action scope. Valid values:</p>
     * <ul>
     * <li><p>APPLICATION: The application level.</p>
     * </li>
     * <li><p>COMPONENT: The component level.</p>
     * </li>
     * <li><p>COMPONENT_INSTANCE: The component instance level.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("RunActionScope")
    public String runActionScope;

    public static ComponentInstanceSelector build(java.util.Map<String, ?> map) throws Exception {
        ComponentInstanceSelector self = new ComponentInstanceSelector();
        return TeaModel.build(map, self);
    }

    @Deprecated
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
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
