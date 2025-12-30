// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizMetricShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteBizMetricCommand")
    public String deleteBizMetricCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteBizMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizMetricShrinkRequest self = new DeleteBizMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBizMetricShrinkRequest setDeleteBizMetricCommandShrink(String deleteBizMetricCommandShrink) {
        this.deleteBizMetricCommandShrink = deleteBizMetricCommandShrink;
        return this;
    }
    public String getDeleteBizMetricCommandShrink() {
        return this.deleteBizMetricCommandShrink;
    }

    public DeleteBizMetricShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
