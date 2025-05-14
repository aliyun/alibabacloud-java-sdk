// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableFieldShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7noNyJxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FieldIdOrName")
    public String fieldIdOrName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Property")
    public String propertyShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static UpdateMultiDimTableFieldShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableFieldShrinkRequest self = new UpdateMultiDimTableFieldShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableFieldShrinkRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public UpdateMultiDimTableFieldShrinkRequest setFieldIdOrName(String fieldIdOrName) {
        this.fieldIdOrName = fieldIdOrName;
        return this;
    }
    public String getFieldIdOrName() {
        return this.fieldIdOrName;
    }

    public UpdateMultiDimTableFieldShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMultiDimTableFieldShrinkRequest setPropertyShrink(String propertyShrink) {
        this.propertyShrink = propertyShrink;
        return this;
    }
    public String getPropertyShrink() {
        return this.propertyShrink;
    }

    public UpdateMultiDimTableFieldShrinkRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public UpdateMultiDimTableFieldShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
