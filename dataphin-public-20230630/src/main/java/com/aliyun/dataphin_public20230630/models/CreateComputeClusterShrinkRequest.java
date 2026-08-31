// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeClusterShrinkRequest extends TeaModel {
    /**
     * <p>The cluster configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterConfig")
    public String clusterConfigShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateComputeClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeClusterShrinkRequest self = new CreateComputeClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeClusterShrinkRequest setClusterConfigShrink(String clusterConfigShrink) {
        this.clusterConfigShrink = clusterConfigShrink;
        return this;
    }
    public String getClusterConfigShrink() {
        return this.clusterConfigShrink;
    }

    public CreateComputeClusterShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateComputeClusterShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
