// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to transfer.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to view the details of the instances under the account, including the instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds***********</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the resource group that you want to specify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to view the details of the resource groups, including the resource group IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-***************</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The ID of the region where the instance you want to transfer is located.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to view the details of the instances under the account, including the region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateResourceGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAttributeRequest self = new UpdateResourceGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAttributeRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpdateResourceGroupAttributeRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public UpdateResourceGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
