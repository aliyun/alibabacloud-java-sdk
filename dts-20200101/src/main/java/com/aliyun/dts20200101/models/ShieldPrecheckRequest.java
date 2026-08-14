// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ShieldPrecheckRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or synchronization instance. You can call the <strong>DescribeMigrationJobs</strong> or DescribeSynchronizationJobs operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsi76118o3w92****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The precheck items to skip. Separate multiple items with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>CHECK_SAME_OBJ</strong>: checks whether objects with the same name exist.</li>
     * <li><strong>CHECK_SAME_USER</strong>: checks whether accounts with different names exist.</li>
     * <li><strong>CHECK_SRC</strong>: checks the source database version.</li>
     * <li><strong>CHECK_TOPOLOGY</strong>: checks the topology version.<blockquote>
     * <p>For the topology versions supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Topology overview</a>.</p>
     * </blockquote>
     * </li>
     * <li><strong>CHECK_SERVER_ID</strong>: checks the server_id of the source database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ</p>
     */
    @NameInMap("PrecheckItems")
    public String precheckItems;

    /**
     * <p>The ID of the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
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
