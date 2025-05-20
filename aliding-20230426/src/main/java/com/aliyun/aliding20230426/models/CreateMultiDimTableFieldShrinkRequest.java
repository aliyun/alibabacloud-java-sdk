// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMultiDimTableFieldShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMultiDimTableFieldShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiDimTableFieldShrinkRequest self = new CreateMultiDimTableFieldShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiDimTableFieldShrinkRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public CreateMultiDimTableFieldShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMultiDimTableFieldShrinkRequest setPropertyShrink(String propertyShrink) {
        this.propertyShrink = propertyShrink;
        return this;
    }
    public String getPropertyShrink() {
        return this.propertyShrink;
    }

    public CreateMultiDimTableFieldShrinkRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public CreateMultiDimTableFieldShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateMultiDimTableFieldShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
