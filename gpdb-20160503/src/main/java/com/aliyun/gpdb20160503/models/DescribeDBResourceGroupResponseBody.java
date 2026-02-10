// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupItems")
    public DescribeDBResourceGroupResponseBodyResourceGroupItems resourceGroupItems;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBResourceGroupResponseBody setResourceGroupItems(DescribeDBResourceGroupResponseBodyResourceGroupItems resourceGroupItems) {
        this.resourceGroupItems = resourceGroupItems;
        return this;
    }
    public DescribeDBResourceGroupResponseBodyResourceGroupItems getResourceGroupItems() {
        return this.resourceGroupItems;
    }

    public static class DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList extends TeaModel {
        @NameInMap("Role")
        public java.util.List<String> role;

        public static DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList self = new DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList setRole(java.util.List<String> role) {
            this.role = role;
            return this;
        }
        public java.util.List<String> getRole() {
            return this.role;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem extends TeaModel {
        @NameInMap("ResourceGroupConfig")
        public String resourceGroupConfig;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("RoleList")
        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList roleList;

        public static DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem self = new DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem setResourceGroupConfig(String resourceGroupConfig) {
            this.resourceGroupConfig = resourceGroupConfig;
            return this;
        }
        public String getResourceGroupConfig() {
            return this.resourceGroupConfig;
        }

        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem setRoleList(DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList roleList) {
            this.roleList = roleList;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItemRoleList getRoleList() {
            return this.roleList;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyResourceGroupItems extends TeaModel {
        @NameInMap("ResourceGroupItem")
        public java.util.List<DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem> resourceGroupItem;

        public static DescribeDBResourceGroupResponseBodyResourceGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyResourceGroupItems self = new DescribeDBResourceGroupResponseBodyResourceGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyResourceGroupItems setResourceGroupItem(java.util.List<DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem> resourceGroupItem) {
            this.resourceGroupItem = resourceGroupItem;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyResourceGroupItemsResourceGroupItem> getResourceGroupItem() {
            return this.resourceGroupItem;
        }

    }

}
