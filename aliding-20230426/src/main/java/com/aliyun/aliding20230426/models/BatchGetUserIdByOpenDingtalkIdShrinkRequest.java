// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;DTOJdYJ2IQC4HuexhtjsS8Qxxxx&quot;,&quot;D8301AKf6lmZbXiilcB4P2MVxxxx&quot;]</p>
     */
    @NameInMap("openDingtalkIds")
    public String openDingtalkIdsShrink;

    public static BatchGetUserIdByOpenDingtalkIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdShrinkRequest self = new BatchGetUserIdByOpenDingtalkIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public BatchGetUserIdByOpenDingtalkIdShrinkRequest setOpenDingtalkIdsShrink(String openDingtalkIdsShrink) {
        this.openDingtalkIdsShrink = openDingtalkIdsShrink;
        return this;
    }
    public String getOpenDingtalkIdsShrink() {
        return this.openDingtalkIdsShrink;
    }

}
