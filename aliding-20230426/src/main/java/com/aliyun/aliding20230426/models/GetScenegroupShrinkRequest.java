// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScenegroupShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetScenegroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenegroupShrinkRequest self = new GetScenegroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetScenegroupShrinkRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetScenegroupShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
