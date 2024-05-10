// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertColumnsBeforeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Column")
    public Long column;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ColumnCount")
    public Long columnCount;

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
    @NameInMap("WorkbookId")
    public String workbookId;

    public static InsertColumnsBeforeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertColumnsBeforeShrinkRequest self = new InsertColumnsBeforeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertColumnsBeforeShrinkRequest setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public InsertColumnsBeforeShrinkRequest setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public InsertColumnsBeforeShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public InsertColumnsBeforeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public InsertColumnsBeforeShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
