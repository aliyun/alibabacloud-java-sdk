// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsResponseBody extends TeaModel {
    @NameInMap("ComponentGroups")
    @Validation(required = true)
    public java.util.List<DescribeAddonsResponseBodyComponentGroups> componentGroups;

    @NameInMap("StandardComponents")
    @Validation(required = true)
    public DescribeAddonsResponseBodyStandardComponents standardComponents;

    public static DescribeAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsResponseBody self = new DescribeAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeAddonsResponseBodyComponentGroupsItems extends TeaModel {
        @NameInMap("name")
        @Validation(required = true)
        public String name;

        @NameInMap("required")
        @Validation(required = true)
        public String required;

        @NameInMap("version")
        @Validation(required = true)
        public String version;

        public static DescribeAddonsResponseBodyComponentGroupsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroupsItems self = new DescribeAddonsResponseBodyComponentGroupsItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAddonsResponseBodyComponentGroups extends TeaModel {
        @NameInMap("group_name")
        @Validation(required = true)
        public String groupName;

        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<DescribeAddonsResponseBodyComponentGroupsItems> items;

        @NameInMap("default")
        @Validation(required = true)
        public java.util.List<String> _default;

        public static DescribeAddonsResponseBodyComponentGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyComponentGroups self = new DescribeAddonsResponseBodyComponentGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAddonsResponseBodyStandardComponentsAddonName extends TeaModel {
        @NameInMap("name")
        @Validation(required = true)
        public String name;

        @NameInMap("required")
        @Validation(required = true)
        public String required;

        @NameInMap("version")
        @Validation(required = true)
        public String version;

        public static DescribeAddonsResponseBodyStandardComponentsAddonName build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyStandardComponentsAddonName self = new DescribeAddonsResponseBodyStandardComponentsAddonName();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAddonsResponseBodyStandardComponents extends TeaModel {
        @NameInMap("addon_name")
        @Validation(required = true)
        public DescribeAddonsResponseBodyStandardComponentsAddonName addonName;

        public static DescribeAddonsResponseBodyStandardComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonsResponseBodyStandardComponents self = new DescribeAddonsResponseBodyStandardComponents();
            return TeaModel.build(map, self);
        }

    }

}
