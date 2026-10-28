// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDtsMembersRequest extends TeaModel {
    /**
     * <p>The instance ID of the active-active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1i99e8l7913****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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

    public static DescribeGadInstanceDtsMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDtsMembersRequest self = new DescribeGadInstanceDtsMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDtsMembersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGadInstanceDtsMembersRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeGadInstanceDtsMembersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstanceDtsMembersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
