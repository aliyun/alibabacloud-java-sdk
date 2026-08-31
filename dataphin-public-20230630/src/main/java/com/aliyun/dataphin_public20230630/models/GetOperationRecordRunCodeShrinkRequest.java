// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordRunCodeShrinkRequest extends TeaModel {
    /**
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeCommand")
    public String codeCommandShrink;

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

    public static GetOperationRecordRunCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordRunCodeShrinkRequest self = new GetOperationRecordRunCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordRunCodeShrinkRequest setCodeCommandShrink(String codeCommandShrink) {
        this.codeCommandShrink = codeCommandShrink;
        return this;
    }
    public String getCodeCommandShrink() {
        return this.codeCommandShrink;
    }

    public GetOperationRecordRunCodeShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetOperationRecordRunCodeShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
