// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeClusterShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterConfig")
    public String clusterConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102311</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static UpdateComputeClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeClusterShrinkRequest self = new UpdateComputeClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeClusterShrinkRequest setClusterConfigShrink(String clusterConfigShrink) {
        this.clusterConfigShrink = clusterConfigShrink;
        return this;
    }
    public String getClusterConfigShrink() {
        return this.clusterConfigShrink;
    }

    public UpdateComputeClusterShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateComputeClusterShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateComputeClusterShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
