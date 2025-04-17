// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApiByAppShrinkRequest extends TeaModel {
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
     */
    @NameInMap("PageQuery")
    public String pageQueryShrink;

    public static ListApiByAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiByAppShrinkRequest self = new ListApiByAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApiByAppShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListApiByAppShrinkRequest setPageQueryShrink(String pageQueryShrink) {
        this.pageQueryShrink = pageQueryShrink;
        return this;
    }
    public String getPageQueryShrink() {
        return this.pageQueryShrink;
    }

}
