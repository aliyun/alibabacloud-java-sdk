// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizMetricShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateBizMetricCommand")
    public String updateBizMetricCommandShrink;

    public static UpdateBizMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizMetricShrinkRequest self = new UpdateBizMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizMetricShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBizMetricShrinkRequest setUpdateBizMetricCommandShrink(String updateBizMetricCommandShrink) {
        this.updateBizMetricCommandShrink = updateBizMetricCommandShrink;
        return this;
    }
    public String getUpdateBizMetricCommandShrink() {
        return this.updateBizMetricCommandShrink;
    }

}
