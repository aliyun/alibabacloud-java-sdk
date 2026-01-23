// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StandardGetQuery")
    public String standardGetQueryShrink;

    public static GetStandardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardShrinkRequest self = new GetStandardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStandardShrinkRequest setStandardGetQueryShrink(String standardGetQueryShrink) {
        this.standardGetQueryShrink = standardGetQueryShrink;
        return this;
    }
    public String getStandardGetQueryShrink() {
        return this.standardGetQueryShrink;
    }

}
