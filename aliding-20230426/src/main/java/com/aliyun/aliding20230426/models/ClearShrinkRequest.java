// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearShrinkRequest extends TeaModel {
    @NameInMap("RangeAddress")
    public String rangeAddress;

    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static ClearShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearShrinkRequest self = new ClearShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ClearShrinkRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public ClearShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public ClearShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public ClearShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
