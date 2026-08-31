// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListOperationRecordShrinkRequest extends TeaModel {
    /**
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCommand")
    public String listCommandShrink;

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

    public static ListOperationRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationRecordShrinkRequest self = new ListOperationRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationRecordShrinkRequest setListCommandShrink(String listCommandShrink) {
        this.listCommandShrink = listCommandShrink;
        return this;
    }
    public String getListCommandShrink() {
        return this.listCommandShrink;
    }

    public ListOperationRecordShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListOperationRecordShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
