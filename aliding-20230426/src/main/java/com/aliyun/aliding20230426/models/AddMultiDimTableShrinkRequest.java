// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMultiDimTableShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7nxxxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("Fields")
    public String fieldsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static AddMultiDimTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMultiDimTableShrinkRequest self = new AddMultiDimTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddMultiDimTableShrinkRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public AddMultiDimTableShrinkRequest setFieldsShrink(String fieldsShrink) {
        this.fieldsShrink = fieldsShrink;
        return this;
    }
    public String getFieldsShrink() {
        return this.fieldsShrink;
    }

    public AddMultiDimTableShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMultiDimTableShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
