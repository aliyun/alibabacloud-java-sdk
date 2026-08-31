// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizMetricShrinkRequest extends TeaModel {
    /**
     * <p>The create request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateBizMetricCommand")
    public String createBizMetricCommandShrink;

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

    public CreateBizMetricShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
