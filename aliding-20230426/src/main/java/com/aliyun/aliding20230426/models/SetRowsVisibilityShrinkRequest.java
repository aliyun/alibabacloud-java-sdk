// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetRowsVisibilityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Row")
    public Long row;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RowCount")
    public Long rowCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static SetRowsVisibilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRowsVisibilityShrinkRequest self = new SetRowsVisibilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetRowsVisibilityShrinkRequest setRow(Long row) {
        this.row = row;
        return this;
    }
    public Long getRow() {
        return this.row;
    }

    public SetRowsVisibilityShrinkRequest setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public SetRowsVisibilityShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public SetRowsVisibilityShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public SetRowsVisibilityShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public SetRowsVisibilityShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
