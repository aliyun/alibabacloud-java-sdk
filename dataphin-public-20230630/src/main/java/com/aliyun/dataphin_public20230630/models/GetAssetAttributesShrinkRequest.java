// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetAttributesShrinkRequest extends TeaModel {
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

    /**
     * <p>The query instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryCommand")
    public String queryCommandShrink;

    public static GetAssetAttributesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetAttributesShrinkRequest self = new GetAssetAttributesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetAttributesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetAssetAttributesShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetAssetAttributesShrinkRequest setQueryCommandShrink(String queryCommandShrink) {
        this.queryCommandShrink = queryCommandShrink;
        return this;
    }
    public String getQueryCommandShrink() {
        return this.queryCommandShrink;
    }

}
