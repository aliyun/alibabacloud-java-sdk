// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllSheetsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>144972</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetMultiDimTableAllSheetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllSheetsShrinkRequest self = new GetMultiDimTableAllSheetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllSheetsShrinkRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public GetMultiDimTableAllSheetsShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
