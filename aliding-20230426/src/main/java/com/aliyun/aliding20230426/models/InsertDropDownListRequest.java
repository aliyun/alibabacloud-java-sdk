// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertDropDownListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Options")
    public java.util.List<InsertDropDownListRequestOptions> options;

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
    public InsertDropDownListRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static InsertDropDownListRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertDropDownListRequest self = new InsertDropDownListRequest();
        return TeaModel.build(map, self);
    }

    public InsertDropDownListRequest setOptions(java.util.List<InsertDropDownListRequestOptions> options) {
        this.options = options;
        return this;
    }
    public java.util.List<InsertDropDownListRequestOptions> getOptions() {
        return this.options;
    }

    public InsertDropDownListRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public InsertDropDownListRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public InsertDropDownListRequest setTenantContext(InsertDropDownListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InsertDropDownListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public InsertDropDownListRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class InsertDropDownListRequestOptions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>#FF0000</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Value")
        public String value;

        public static InsertDropDownListRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            InsertDropDownListRequestOptions self = new InsertDropDownListRequestOptions();
            return TeaModel.build(map, self);
        }

        public InsertDropDownListRequestOptions setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public InsertDropDownListRequestOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InsertDropDownListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static InsertDropDownListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InsertDropDownListRequestTenantContext self = new InsertDropDownListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InsertDropDownListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
