// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertRowsBeforeShrinkRequest extends TeaModel {
    @NameInMap("Row")
    public Long row;

    @NameInMap("RowCount")
    public Long rowCount;

    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static InsertRowsBeforeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRowsBeforeShrinkRequest self = new InsertRowsBeforeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertRowsBeforeShrinkRequest setRow(Long row) {
        this.row = row;
        return this;
    }
    public Long getRow() {
        return this.row;
    }

    public InsertRowsBeforeShrinkRequest setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public InsertRowsBeforeShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public InsertRowsBeforeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public InsertRowsBeforeShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
