// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSheetShrinkRequest extends TeaModel {
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static DeleteSheetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSheetShrinkRequest self = new DeleteSheetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSheetShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public DeleteSheetShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public DeleteSheetShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
