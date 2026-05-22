// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOpenDingtalkIdShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DTOJdYJ2IQC4HuexhtjsSXXXX</p>
     */
    @NameInMap("openDingtalkId")
    public String openDingtalkId;

    public static GetUserIdByOpenDingtalkIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOpenDingtalkIdShrinkRequest self = new GetUserIdByOpenDingtalkIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOpenDingtalkIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetUserIdByOpenDingtalkIdShrinkRequest setOpenDingtalkId(String openDingtalkId) {
        this.openDingtalkId = openDingtalkId;
        return this;
    }
    public String getOpenDingtalkId() {
        return this.openDingtalkId;
    }

}
