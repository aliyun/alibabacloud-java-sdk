// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRangeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A3:C3</p>
     */
    @NameInMap("RangeAddress")
    public String rangeAddress;

    /**
     * <strong>example:</strong>
     * <p>values</p>
     */
    @NameInMap("Select")
    public String select;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public GetRangeRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static GetRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRangeRequest self = new GetRangeRequest();
        return TeaModel.build(map, self);
    }

    public GetRangeRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public GetRangeRequest setSelect(String select) {
        this.select = select;
        return this;
    }
    public String getSelect() {
        return this.select;
    }

    public GetRangeRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public GetRangeRequest setTenantContext(GetRangeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetRangeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetRangeRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class GetRangeRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetRangeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetRangeRequestTenantContext self = new GetRangeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetRangeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
