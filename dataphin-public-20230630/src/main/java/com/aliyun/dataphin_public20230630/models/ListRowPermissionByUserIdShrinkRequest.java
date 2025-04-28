// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionByUserIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListRowPermissionByUserIdQuery")
    public String listRowPermissionByUserIdQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListRowPermissionByUserIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionByUserIdShrinkRequest self = new ListRowPermissionByUserIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionByUserIdShrinkRequest setListRowPermissionByUserIdQueryShrink(String listRowPermissionByUserIdQueryShrink) {
        this.listRowPermissionByUserIdQueryShrink = listRowPermissionByUserIdQueryShrink;
        return this;
    }
    public String getListRowPermissionByUserIdQueryShrink() {
        return this.listRowPermissionByUserIdQueryShrink;
    }

    public ListRowPermissionByUserIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
