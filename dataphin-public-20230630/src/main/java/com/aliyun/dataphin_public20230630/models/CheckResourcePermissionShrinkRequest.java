// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckResourcePermissionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public String checkCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CheckResourcePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcePermissionShrinkRequest self = new CheckResourcePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourcePermissionShrinkRequest setCheckCommandShrink(String checkCommandShrink) {
        this.checkCommandShrink = checkCommandShrink;
        return this;
    }
    public String getCheckCommandShrink() {
        return this.checkCommandShrink;
    }

    public CheckResourcePermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
