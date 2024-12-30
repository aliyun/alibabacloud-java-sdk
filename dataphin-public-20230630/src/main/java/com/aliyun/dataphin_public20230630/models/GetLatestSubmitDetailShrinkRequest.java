// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLatestSubmitDetailShrinkRequest extends TeaModel {
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
    @NameInMap("SubmitDetailQuery")
    public String submitDetailQueryShrink;

    public static GetLatestSubmitDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestSubmitDetailShrinkRequest self = new GetLatestSubmitDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestSubmitDetailShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetLatestSubmitDetailShrinkRequest setSubmitDetailQueryShrink(String submitDetailQueryShrink) {
        this.submitDetailQueryShrink = submitDetailQueryShrink;
        return this;
    }
    public String getSubmitDetailQueryShrink() {
        return this.submitDetailQueryShrink;
    }

}
