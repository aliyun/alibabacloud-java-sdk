// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantResourcePermissionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantCommand")
    public String grantCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GrantResourcePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantResourcePermissionShrinkRequest self = new GrantResourcePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantResourcePermissionShrinkRequest setGrantCommandShrink(String grantCommandShrink) {
        this.grantCommandShrink = grantCommandShrink;
        return this;
    }
    public String getGrantCommandShrink() {
        return this.grantCommandShrink;
    }

    public GrantResourcePermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
