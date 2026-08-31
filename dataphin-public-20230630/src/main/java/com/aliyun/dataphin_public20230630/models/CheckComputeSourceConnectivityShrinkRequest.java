// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeSourceConnectivityShrinkRequest extends TeaModel {
    /**
     * <p>The check command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public String checkCommandShrink;

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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CheckComputeSourceConnectivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckComputeSourceConnectivityShrinkRequest self = new CheckComputeSourceConnectivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckComputeSourceConnectivityShrinkRequest setCheckCommandShrink(String checkCommandShrink) {
        this.checkCommandShrink = checkCommandShrink;
        return this;
    }
    public String getCheckCommandShrink() {
        return this.checkCommandShrink;
    }

    public CheckComputeSourceConnectivityShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CheckComputeSourceConnectivityShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
