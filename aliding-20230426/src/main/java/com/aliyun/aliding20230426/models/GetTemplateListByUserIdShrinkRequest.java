// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetTemplateListByUserIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListByUserIdShrinkRequest self = new GetTemplateListByUserIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateListByUserIdShrinkRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetTemplateListByUserIdShrinkRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetTemplateListByUserIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
