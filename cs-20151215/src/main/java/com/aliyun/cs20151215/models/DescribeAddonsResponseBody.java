// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsResponseBody extends TeaModel {
    // 组件分组信息，例如：存储类组件，网络组件等。
    @NameInMap("ComponentGroups")
    public java.util.List<DescribeAddonsResponseBodyComponentGroups> componentGroups;

    // 标准组件信息，包含各个组件的描述信息。
    @NameInMap("StandardComponents")
    public DescribeAddonsResponseBodyStandardComponents standardComponents;

    public static DescribeAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsResponseBody self = new DescribeAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonsResponseBody setComponentGroups(java.util.List<DescribeAddonsResponseBodyComponentGroups> componentGroups) {
        this.componentGroups = componentGroups;
        return this;
    }
    public java.util.List<DescribeAddonsResponseBodyComponentGroups> getComponentGroups() {
        return this.componentGroups;
    }

    public DescribeAddonsResponseBody setStandardComponents(DescribeAddonsResponseBodyStandardComponents standardComponents) {
        this.standardComponents = standardComponents;
        return this;
    }
    public DescribeAddonsResponseBodyStandardComponents getStandardComponents() {
        return this.standardComponents;
    }

    public static class DescribeAddonsResponseBodyComponentGroupsItems extends TeaModel {
        // 组件描述信息。
        @NameInMap("description")
        public String description;

        // 是否禁止默认安装。
        @NameInMap("disabled")
        public Boolean disabled;

        // 组件名称。
        @NameInMap("name")
        public String name;

        // 是否为必需组件。
        @NameInMap("required")
        public String required;

        // 组件版本。
        @NameInMap("version")
        public String version;

        public static DescribeAddonsResponseBodyComponentGroupsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroupsItems self = new DescribeAddonsResponseBodyComponentGroupsItems();
            return TeaModel.build(map, self);
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAddonsResponseBodyComponentGroups extends TeaModel {
        // 默认组件组。
        @NameInMap("default")
        public java.util.List<String> _default;

        // 组件组名称。
        @NameInMap("group_name")
        public String groupName;

        // 组件清单。
        @NameInMap("items")
        public java.util.List<DescribeAddonsResponseBodyComponentGroupsItems> items;

        public static DescribeAddonsResponseBodyComponentGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroups self = new DescribeAddonsResponseBodyComponentGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAddonsResponseBodyComponentGroups set_default(java.util.List<String> _default) {
            this._default = _default;
            return this;
        }
        public java.util.List<String> get_default() {
            return this._default;
        }

        public DescribeAddonsResponseBodyComponentGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAddonsResponseBodyComponentGroups setItems(java.util.List<DescribeAddonsResponseBodyComponentGroupsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeAddonsResponseBodyComponentGroupsItems> getItems() {
            return this.items;
        }

    }

    public static class DescribeAddonsResponseBodyStandardComponents extends TeaModel {
        // 组件名称。
        @NameInMap("ComponentName")
        public java.util.Map<String, java.util.Map<String, ?>> componentName;

        public static DescribeAddonsResponseBodyStandardComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyStandardComponents self = new DescribeAddonsResponseBodyStandardComponents();
            return TeaModel.build(map, self);
        }

        public DescribeAddonsResponseBodyStandardComponents setComponentName(java.util.Map<String, java.util.Map<String, ?>> componentName) {
            this.componentName = componentName;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getComponentName() {
            return this.componentName;
        }

    }

}
