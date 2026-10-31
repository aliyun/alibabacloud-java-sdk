// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTasksShrinkRequest extends TeaModel {
    /**
     * <p>The task query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchTaskQuery")
    public String batchTaskQueryShrink;

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
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListBatchTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksShrinkRequest self = new ListBatchTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksShrinkRequest setBatchTaskQueryShrink(String batchTaskQueryShrink) {
        this.batchTaskQueryShrink = batchTaskQueryShrink;
        return this;
    }
    public String getBatchTaskQueryShrink() {
        return this.batchTaskQueryShrink;
    }

    public ListBatchTasksShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListBatchTasksShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
