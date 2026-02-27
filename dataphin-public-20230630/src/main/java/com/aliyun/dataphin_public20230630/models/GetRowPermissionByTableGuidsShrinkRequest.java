// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRowPermissionByTableGuidsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetRowPermissionByTableGuidsQuery")
    public String getRowPermissionByTableGuidsQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetRowPermissionByTableGuidsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRowPermissionByTableGuidsShrinkRequest self = new GetRowPermissionByTableGuidsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRowPermissionByTableGuidsShrinkRequest setGetRowPermissionByTableGuidsQueryShrink(String getRowPermissionByTableGuidsQueryShrink) {
        this.getRowPermissionByTableGuidsQueryShrink = getRowPermissionByTableGuidsQueryShrink;
        return this;
    }
    public String getGetRowPermissionByTableGuidsQueryShrink() {
        return this.getRowPermissionByTableGuidsQueryShrink;
    }

    public GetRowPermissionByTableGuidsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
