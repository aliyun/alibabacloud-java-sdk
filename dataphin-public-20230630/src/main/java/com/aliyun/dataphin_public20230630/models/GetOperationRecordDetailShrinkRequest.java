// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordDetailShrinkRequest extends TeaModel {
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
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordDetailCommand")
    public String recordDetailCommandShrink;

    public static GetOperationRecordDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordDetailShrinkRequest self = new GetOperationRecordDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordDetailShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetOperationRecordDetailShrinkRequest setRecordDetailCommandShrink(String recordDetailCommandShrink) {
        this.recordDetailCommandShrink = recordDetailCommandShrink;
        return this;
    }
    public String getRecordDetailCommandShrink() {
        return this.recordDetailCommandShrink;
    }

}
