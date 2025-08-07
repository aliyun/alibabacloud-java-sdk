// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ChangeDingTalkIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4uf_iw54grufg9</p>
     */
    @NameInMap("DingTalkId")
    public String dingTalkId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static ChangeDingTalkIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDingTalkIdShrinkRequest self = new ChangeDingTalkIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDingTalkIdShrinkRequest setDingTalkId(String dingTalkId) {
        this.dingTalkId = dingTalkId;
        return this;
    }
    public String getDingTalkId() {
        return this.dingTalkId;
    }

    public ChangeDingTalkIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
