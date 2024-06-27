// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The information about the resource group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceGroupItems")
    public java.util.List<ModifyDBResourceGroupRequestResourceGroupItems> resourceGroupItems;

    public static ModifyDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupRequest self = new ModifyDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBResourceGroupRequest setResourceGroupItems(java.util.List<ModifyDBResourceGroupRequestResourceGroupItems> resourceGroupItems) {
        this.resourceGroupItems = resourceGroupItems;
        return this;
    }
    public java.util.List<ModifyDBResourceGroupRequestResourceGroupItems> getResourceGroupItems() {
        return this.resourceGroupItems;
    }

    public static class ModifyDBResourceGroupRequestResourceGroupItems extends TeaModel {
        /**
         * <p>The configurations of the resource group to which you want to modify.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CpuRateLimit&quot;:&quot;10&quot;,&quot;MemoryLimit&quot;:&quot;12&quot;,&quot;MemorySharedQuota&quot;:&quot;20&quot;,&quot;MemorySpillRatio&quot;:&quot;75&quot;,&quot;Concurrency&quot;:&quot;3&quot;}</p>
         */
        @NameInMap("ResourceGroupConfig")
        public String resourceGroupConfig;

        /**
         * <p>The name of the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static ModifyDBResourceGroupRequestResourceGroupItems build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestResourceGroupItems self = new ModifyDBResourceGroupRequestResourceGroupItems();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestResourceGroupItems setResourceGroupConfig(String resourceGroupConfig) {
            this.resourceGroupConfig = resourceGroupConfig;
            return this;
        }
        public String getResourceGroupConfig() {
            return this.resourceGroupConfig;
        }

        public ModifyDBResourceGroupRequestResourceGroupItems setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

}
