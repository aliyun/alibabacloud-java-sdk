// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardValidMappingShrinkRequest extends TeaModel {
    /**
     * <p>The delete instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public String deleteCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static DeleteStandardValidMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardValidMappingShrinkRequest self = new DeleteStandardValidMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardValidMappingShrinkRequest setDeleteCommandShrink(String deleteCommandShrink) {
        this.deleteCommandShrink = deleteCommandShrink;
        return this;
    }
    public String getDeleteCommandShrink() {
        return this.deleteCommandShrink;
    }

    public DeleteStandardValidMappingShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteStandardValidMappingShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
