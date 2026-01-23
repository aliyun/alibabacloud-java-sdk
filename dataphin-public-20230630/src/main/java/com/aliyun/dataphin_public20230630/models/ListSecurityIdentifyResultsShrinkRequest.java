// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyResultsShrinkRequest extends TeaModel {
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

    public static ListSecurityIdentifyResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyResultsShrinkRequest self = new ListSecurityIdentifyResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyResultsShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListSecurityIdentifyResultsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
