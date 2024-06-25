// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsResponseBody extends TeaModel {
    /**
     * <p>The list of the returned components.</p>
     */
    @NameInMap("ComponentGroups")
    public java.util.List<DescribeAddonsResponseBodyComponentGroups> componentGroups;

    /**
     * <p>Standard components.</p>
     */
    @NameInMap("StandardComponents")
    public java.util.Map<String, StandardComponentsValue> standardComponents;

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

    public DescribeAddonsResponseBody setStandardComponents(java.util.Map<String, StandardComponentsValue> standardComponents) {
        this.standardComponents = standardComponents;
        return this;
    }
    public java.util.Map<String, StandardComponentsValue> getStandardComponents() {
        return this.standardComponents;
    }

    public static class DescribeAddonsResponseBodyComponentGroupsItems extends TeaModel {
        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>flexvolume</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeAddonsResponseBodyComponentGroupsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroupsItems self = new DescribeAddonsResponseBodyComponentGroupsItems();
            return TeaModel.build(map, self);
        }

        public DescribeAddonsResponseBodyComponentGroupsItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAddonsResponseBodyComponentGroups extends TeaModel {
        /**
         * <p>The name of the component group.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("group_name")
        public String groupName;

        /**
         * <p>The names of the components in the component group.</p>
         */
        @NameInMap("items")
        public java.util.List<DescribeAddonsResponseBodyComponentGroupsItems> items;

        public static DescribeAddonsResponseBodyComponentGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroups self = new DescribeAddonsResponseBodyComponentGroups();
            return TeaModel.build(map, self);
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

}
