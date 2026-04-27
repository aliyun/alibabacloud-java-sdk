// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE,DOWNGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-tyarplz****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>2C4G</p>
     */
    @NameInMap("ProjectSpec")
    public String projectSpec;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
