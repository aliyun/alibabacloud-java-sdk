// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceAuthUserMappingsShrinkRequest extends TeaModel {
    /**
     * <p>The compute resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123455</p>
     */
    @NameInMap("ComputeResourceId")
    public Long computeResourceId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of user mappings to remove.</p>
     */
    @NameInMap("RemoveUserIds")
    public String removeUserIdsShrink;

    /**
     * <p>The list of objects to update.</p>
     */
    @NameInMap("Upserts")
    public String upsertsShrink;

    public static UpdateComputeResourceAuthUserMappingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceAuthUserMappingsShrinkRequest self = new UpdateComputeResourceAuthUserMappingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceAuthUserMappingsShrinkRequest setComputeResourceId(Long computeResourceId) {
        this.computeResourceId = computeResourceId;
        return this;
    }
    public Long getComputeResourceId() {
        return this.computeResourceId;
    }

    public UpdateComputeResourceAuthUserMappingsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateComputeResourceAuthUserMappingsShrinkRequest setRemoveUserIdsShrink(String removeUserIdsShrink) {
        this.removeUserIdsShrink = removeUserIdsShrink;
        return this;
    }
    public String getRemoveUserIdsShrink() {
        return this.removeUserIdsShrink;
    }

    public UpdateComputeResourceAuthUserMappingsShrinkRequest setUpsertsShrink(String upsertsShrink) {
        this.upsertsShrink = upsertsShrink;
        return this;
    }
    public String getUpsertsShrink() {
        return this.upsertsShrink;
    }

}
