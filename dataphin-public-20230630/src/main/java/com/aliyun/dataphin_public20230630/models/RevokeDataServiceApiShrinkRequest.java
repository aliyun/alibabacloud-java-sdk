// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeDataServiceApiShrinkRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RevokeCommand")
    public String revokeCommandShrink;

    public static RevokeDataServiceApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeDataServiceApiShrinkRequest self = new RevokeDataServiceApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeDataServiceApiShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RevokeDataServiceApiShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public RevokeDataServiceApiShrinkRequest setRevokeCommandShrink(String revokeCommandShrink) {
        this.revokeCommandShrink = revokeCommandShrink;
        return this;
    }
    public String getRevokeCommandShrink() {
        return this.revokeCommandShrink;
    }

}
