// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConvertInstanceResourceGroupRequest extends TeaModel {
    /**
     * <p>A legacy parameter. This parameter does not take effect. You do not need to pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>m4312mab158****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the new resource group. You can obtain the ID from the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2r4fkrqw****</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The region in which the DTS instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A parameter reserved for special business scenarios. You do not need to pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-3m1213ye7l****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the DTS instance. You can view the ID in the <strong>ID/Name</strong> column on the task list page in the console.</p>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtszhc12zp727o****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>A parameter reserved for special business scenarios. You do not need to pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ConvertInstanceResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResourceGroupRequest self = new ConvertInstanceResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResourceGroupRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ConvertInstanceResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ConvertInstanceResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConvertInstanceResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConvertInstanceResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ConvertInstanceResourceGroupRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
