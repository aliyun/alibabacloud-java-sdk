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

    /**
     * <p>The queried resource group information.</p>
     */
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
        /**
         * <p>The configurations of the resource group.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>CpuRateLimit: the percentage of CPU resources that are available for the resource group. Unit: %.</p>
         * </li>
         * <li><p>MemoryLimit: the percentage of memory resources that are available for the resource group. Unit: %.</p>
         * </li>
         * <li><p>MemorySharedQuota: the percentage of memory resources shared among transactions that are submitted to the resource group. Unit: %. Default value: 80.</p>
         * </li>
         * <li><p>MemorySpillRatio: the memory spill ratio for memory-intensive transactions. When the memory that is used by memory-intensive transactions reaches this value, data is spilled to disks. Unit: %. Default value: 0.</p>
         * </li>
         * <li><p>Concurrency: the maximum number of concurrent transactions or parallel queries that are allowed for a resource group. Default value: 20.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CpuRateLimit&quot;:&quot;10&quot;,&quot;MemoryLimit&quot;:&quot;12&quot;,&quot;MemorySharedQuota&quot;:&quot;20&quot;,&quot;MemorySpillRatio&quot;:&quot;75&quot;,&quot;Concurrency&quot;:&quot;3&quot;}</p>
         */
        @NameInMap("ResourceGroupConfig")
        public String resourceGroupConfig;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The roles.</p>
         */
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
