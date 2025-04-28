// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAccountByRowPermissionIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetAccountByRowPermissionIdQuery")
    public String getAccountByRowPermissionIdQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetAccountByRowPermissionIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByRowPermissionIdShrinkRequest self = new GetAccountByRowPermissionIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountByRowPermissionIdShrinkRequest setGetAccountByRowPermissionIdQueryShrink(String getAccountByRowPermissionIdQueryShrink) {
        this.getAccountByRowPermissionIdQueryShrink = getAccountByRowPermissionIdQueryShrink;
        return this;
    }
    public String getGetAccountByRowPermissionIdQueryShrink() {
        return this.getAccountByRowPermissionIdQueryShrink;
    }

    public GetAccountByRowPermissionIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
