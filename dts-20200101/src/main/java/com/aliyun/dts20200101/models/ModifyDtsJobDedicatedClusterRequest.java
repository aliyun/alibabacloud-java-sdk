// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobDedicatedClusterRequest extends TeaModel {
    /**
     * <p>The dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsxxxx</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The DTS task IDs. The value can be a JSON array that consists of multiple DTS task IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;dtsxxxx01&quot;, &quot;dtsxxx02&quot;]</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the DTS instance resides.</p>
     * <blockquote>
     * <p>For information about the regions that support dedicated clusters, see <a href="https://help.aliyun.com/document_detail/417481.html">DTS dedicated cluster</a>.</p>
     * </blockquote>
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

    public static ModifyDtsJobDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobDedicatedClusterRequest self = new ModifyDtsJobDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobDedicatedClusterRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public ModifyDtsJobDedicatedClusterRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public ModifyDtsJobDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDtsJobDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobDedicatedClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
