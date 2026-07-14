// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectResourceRequest extends TeaModel {
    /**
     * <p>The specification change type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE,DOWNGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The Supabase instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-tyarplz****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The specifications of the Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2C4G</p>
     */
    @NameInMap("ProjectSpec")
    public String projectSpec;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The storage size, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    public static ModifySupabaseProjectResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectResourceRequest self = new ModifySupabaseProjectResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectResourceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifySupabaseProjectResourceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifySupabaseProjectResourceRequest setProjectSpec(String projectSpec) {
        this.projectSpec = projectSpec;
        return this;
    }
    public String getProjectSpec() {
        return this.projectSpec;
    }

    public ModifySupabaseProjectResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySupabaseProjectResourceRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

}
