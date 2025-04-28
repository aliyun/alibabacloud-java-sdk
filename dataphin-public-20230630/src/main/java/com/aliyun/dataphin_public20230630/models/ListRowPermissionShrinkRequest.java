// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionShrinkRequest extends TeaModel {
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
    @NameInMap("PageRowPermissionQuery")
    public String pageRowPermissionQueryShrink;

    public static ListRowPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionShrinkRequest self = new ListRowPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListRowPermissionShrinkRequest setPageRowPermissionQueryShrink(String pageRowPermissionQueryShrink) {
        this.pageRowPermissionQueryShrink = pageRowPermissionQueryShrink;
        return this;
    }
    public String getPageRowPermissionQueryShrink() {
        return this.pageRowPermissionQueryShrink;
    }

}
