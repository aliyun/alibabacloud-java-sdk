// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAuthorizedDataServiceApiDetailsShrinkRequest extends TeaModel {
    /**
     * <p>The query request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("ListQuery")
    public String listQueryShrink;

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

    public static ListAuthorizedDataServiceApiDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDataServiceApiDetailsShrinkRequest self = new ListAuthorizedDataServiceApiDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDataServiceApiDetailsShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListAuthorizedDataServiceApiDetailsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListAuthorizedDataServiceApiDetailsShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
