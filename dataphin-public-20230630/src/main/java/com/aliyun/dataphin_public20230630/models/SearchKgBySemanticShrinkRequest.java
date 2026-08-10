// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SearchKgBySemanticShrinkRequest extends TeaModel {
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
     * <p>The search command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SearchCommand")
    public String searchCommandShrink;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchKgBySemanticShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchKgBySemanticShrinkRequest self = new SearchKgBySemanticShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchKgBySemanticShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SearchKgBySemanticShrinkRequest setSearchCommandShrink(String searchCommandShrink) {
        this.searchCommandShrink = searchCommandShrink;
        return this;
    }
    public String getSearchCommandShrink() {
        return this.searchCommandShrink;
    }

    public SearchKgBySemanticShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
