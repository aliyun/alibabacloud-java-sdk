// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizMetricShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateBizMetricCommand")
    public String createBizMetricCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateBizMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizMetricShrinkRequest self = new CreateBizMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizMetricShrinkRequest setCreateBizMetricCommandShrink(String createBizMetricCommandShrink) {
        this.createBizMetricCommandShrink = createBizMetricCommandShrink;
        return this;
    }
    public String getCreateBizMetricCommandShrink() {
        return this.createBizMetricCommandShrink;
    }

    public CreateBizMetricShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
