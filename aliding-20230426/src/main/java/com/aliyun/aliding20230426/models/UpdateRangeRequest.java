// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeRequest extends TeaModel {
    @NameInMap("BackgroundColors")
    public java.util.List<java.util.List<String>> backgroundColors;

    @NameInMap("Hyperlinks")
    public java.util.List<java.util.List<UpdateRangeRequestHyperlinks>> hyperlinks;

    @NameInMap("NumberFormat")
    public String numberFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RangeAddress")
    public String rangeAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public UpdateRangeRequestTenantContext tenantContext;

    @NameInMap("Values")
    public java.util.List<java.util.List<String>> values;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static UpdateRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRangeRequest self = new UpdateRangeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRangeRequest setBackgroundColors(java.util.List<java.util.List<String>> backgroundColors) {
        this.backgroundColors = backgroundColors;
        return this;
    }
    public java.util.List<java.util.List<String>> getBackgroundColors() {
        return this.backgroundColors;
    }

    public UpdateRangeRequest setHyperlinks(java.util.List<java.util.List<UpdateRangeRequestHyperlinks>> hyperlinks) {
        this.hyperlinks = hyperlinks;
        return this;
    }
    public java.util.List<java.util.List<UpdateRangeRequestHyperlinks>> getHyperlinks() {
        return this.hyperlinks;
    }

    public UpdateRangeRequest setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }
    public String getNumberFormat() {
        return this.numberFormat;
    }

    public UpdateRangeRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public UpdateRangeRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public UpdateRangeRequest setTenantContext(UpdateRangeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateRangeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateRangeRequest setValues(java.util.List<java.util.List<String>> values) {
        this.values = values;
        return this;
    }
    public java.util.List<java.util.List<String>> getValues() {
        return this.values;
    }

    public UpdateRangeRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class UpdateRangeRequestHyperlinks extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Link")
        public String link;

        @NameInMap("Text")
        public String text;

        public static UpdateRangeRequestHyperlinks build(java.util.Map<String, ?> map) throws Exception {
            UpdateRangeRequestHyperlinks self = new UpdateRangeRequestHyperlinks();
            return TeaModel.build(map, self);
        }

        public UpdateRangeRequestHyperlinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateRangeRequestHyperlinks setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public UpdateRangeRequestHyperlinks setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class UpdateRangeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateRangeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateRangeRequestTenantContext self = new UpdateRangeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateRangeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
