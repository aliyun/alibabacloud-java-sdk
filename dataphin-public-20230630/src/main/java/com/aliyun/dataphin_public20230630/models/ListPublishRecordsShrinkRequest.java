// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPublishRecordsShrinkRequest extends TeaModel {
    /**
     * <p>Query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public String listQueryShrink;

    /**
     * <p>Tenant ID.</p>
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

    public static ListPublishRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishRecordsShrinkRequest self = new ListPublishRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishRecordsShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListPublishRecordsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListPublishRecordsShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
