// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeSourcesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public String listQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListComputeSourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeSourcesShrinkRequest self = new ListComputeSourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeSourcesShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListComputeSourcesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
