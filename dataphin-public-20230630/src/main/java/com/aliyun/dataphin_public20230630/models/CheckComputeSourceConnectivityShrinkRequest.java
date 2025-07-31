// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeSourceConnectivityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public String checkCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

}
