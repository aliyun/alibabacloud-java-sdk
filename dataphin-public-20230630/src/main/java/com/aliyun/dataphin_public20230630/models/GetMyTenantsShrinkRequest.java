// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyTenantsShrinkRequest extends TeaModel {
    @NameInMap("FeatureCodeList")
    public String featureCodeListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetMyTenantsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMyTenantsShrinkRequest self = new GetMyTenantsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMyTenantsShrinkRequest setFeatureCodeListShrink(String featureCodeListShrink) {
        this.featureCodeListShrink = featureCodeListShrink;
        return this;
    }
    public String getFeatureCodeListShrink() {
        return this.featureCodeListShrink;
    }

    public GetMyTenantsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
