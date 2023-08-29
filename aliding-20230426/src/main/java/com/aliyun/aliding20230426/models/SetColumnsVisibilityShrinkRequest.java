// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetColumnsVisibilityShrinkRequest extends TeaModel {
    @NameInMap("Column")
    public Long column;

    @NameInMap("ColumnCount")
    public Long columnCount;

    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static SetColumnsVisibilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetColumnsVisibilityShrinkRequest self = new SetColumnsVisibilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetColumnsVisibilityShrinkRequest setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public SetColumnsVisibilityShrinkRequest setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public SetColumnsVisibilityShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public SetColumnsVisibilityShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public SetColumnsVisibilityShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public SetColumnsVisibilityShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
