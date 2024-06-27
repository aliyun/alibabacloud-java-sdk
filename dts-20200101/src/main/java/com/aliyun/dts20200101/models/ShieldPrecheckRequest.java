// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ShieldPrecheckRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization instance. You can call the <strong>DescribeMigrationJobs</strong> or DescribeSynchronizationJobs operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsi76118o3w92****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The precheck items that you want to ignore. Separate multiple items with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>CHECK_SAME_OBJ</strong>: schema name conflict</p>
     * </li>
     * <li><p><strong>CHECK_SAME_USER</strong>: multiple usernames for one instance</p>
     * </li>
     * <li><p><strong>CHECK_SRC</strong>: source database version</p>
     * </li>
     * <li><p><strong>CHECK_TOPOLOGY</strong>: topology</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about the topologies supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Synchronization topologies</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>CHECK_SERVER_ID</strong>: value of server_id in the source database</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ</p>
     */
    @NameInMap("PrecheckItems")
    public String precheckItems;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ShieldPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ShieldPrecheckRequest self = new ShieldPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public ShieldPrecheckRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ShieldPrecheckRequest setPrecheckItems(String precheckItems) {
        this.precheckItems = precheckItems;
        return this;
    }
    public String getPrecheckItems() {
        return this.precheckItems;
    }

    public ShieldPrecheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ShieldPrecheckRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
