// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobNameRequest extends TeaModel {
    /**
     * <p>The ID of the DTS task. The DTS task can be a data migration, data synchronization, or change tracking task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3m1213ye7l****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The new name of the DTS task.</p>
     * <blockquote>
     * <p> We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource GroupId</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzfkjjb5gyy6i</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be:</p>
     * <ul>
     * <li><strong>false</strong>: No. - <strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobNameRequest self = new ModifyDtsJobNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobNameRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobNameRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ModifyDtsJobNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobNameRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobNameRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
