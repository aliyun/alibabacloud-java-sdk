// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetConversaionSpaceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidB8Pzg****FIWPv2PMA==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetConversaionSpaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversaionSpaceShrinkRequest self = new GetConversaionSpaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetConversaionSpaceShrinkRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetConversaionSpaceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
