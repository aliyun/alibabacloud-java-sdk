// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListProjectMembersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1030111021</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1030111021</p>
     */
    @NameInMap("ListQuery")
    public String listQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListProjectMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersShrinkRequest self = new ListProjectMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListProjectMembersShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListProjectMembersShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
