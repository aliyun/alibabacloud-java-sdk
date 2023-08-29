// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeShrinkRequest extends TeaModel {
    @NameInMap("BackgroundColors")
    public String backgroundColorsShrink;

    @NameInMap("Hyperlinks")
    public String hyperlinksShrink;

    @NameInMap("NumberFormat")
    public String numberFormat;

    @NameInMap("RangeAddress")
    public String rangeAddress;

    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("Values")
    public String valuesShrink;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static UpdateRangeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRangeShrinkRequest self = new UpdateRangeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRangeShrinkRequest setBackgroundColorsShrink(String backgroundColorsShrink) {
        this.backgroundColorsShrink = backgroundColorsShrink;
        return this;
    }
    public String getBackgroundColorsShrink() {
        return this.backgroundColorsShrink;
    }

    public UpdateRangeShrinkRequest setHyperlinksShrink(String hyperlinksShrink) {
        this.hyperlinksShrink = hyperlinksShrink;
        return this;
    }
    public String getHyperlinksShrink() {
        return this.hyperlinksShrink;
    }

    public UpdateRangeShrinkRequest setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }
    public String getNumberFormat() {
        return this.numberFormat;
    }

    public UpdateRangeShrinkRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public UpdateRangeShrinkRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public UpdateRangeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateRangeShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

    public UpdateRangeShrinkRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

}
