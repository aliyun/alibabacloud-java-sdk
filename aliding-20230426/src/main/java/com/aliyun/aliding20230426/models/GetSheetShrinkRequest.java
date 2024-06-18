// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static GetSheetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSheetShrinkRequest self = new GetSheetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSheetShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public GetSheetShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetSheetShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
