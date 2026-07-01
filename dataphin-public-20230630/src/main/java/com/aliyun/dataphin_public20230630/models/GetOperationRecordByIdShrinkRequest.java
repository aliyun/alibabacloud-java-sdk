// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordByIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DetailCommand")
    public String detailCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetOperationRecordByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordByIdShrinkRequest self = new GetOperationRecordByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordByIdShrinkRequest setDetailCommandShrink(String detailCommandShrink) {
        this.detailCommandShrink = detailCommandShrink;
        return this;
    }
    public String getDetailCommandShrink() {
        return this.detailCommandShrink;
    }

    public GetOperationRecordByIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
