// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardTemplateShrinkRequest extends TeaModel {
    @NameInMap("FilterQuery")
    public String filterQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Nullable")
    public Boolean nullable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetStandardTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardTemplateShrinkRequest self = new GetStandardTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardTemplateShrinkRequest setFilterQueryShrink(String filterQueryShrink) {
        this.filterQueryShrink = filterQueryShrink;
        return this;
    }
    public String getFilterQueryShrink() {
        return this.filterQueryShrink;
    }

    public GetStandardTemplateShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetStandardTemplateShrinkRequest setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public GetStandardTemplateShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
