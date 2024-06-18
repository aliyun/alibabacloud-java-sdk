// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[[&quot;#ff0000&quot;,&quot;#ff0000&quot;,&quot;#ff0000&quot;]]</p>
     */
    @NameInMap("BackgroundColors")
    public String backgroundColorsShrink;

    /**
     * <strong>example:</strong>
     * <p>[[&quot;type&quot;: &quot;path&quot;,&quot;link&quot;: &quot;<a href="https://www.dingtalk.com%22,%22text">https://www.dingtalk.com&quot;,&quot;text</a>&quot;: &quot;test&quot;]]</p>
     */
    @NameInMap("Hyperlinks")
    public String hyperlinksShrink;

    /**
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("NumberFormat")
    public String numberFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A3:C3</p>
     */
    @NameInMap("RangeAddress")
    public String rangeAddress;

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
     * <strong>example:</strong>
     * <p>[[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]]</p>
     */
    @NameInMap("Values")
    public String valuesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
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
