// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearDataRequest extends TeaModel {
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
    public ClearDataRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static ClearDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearDataRequest self = new ClearDataRequest();
        return TeaModel.build(map, self);
    }

    public ClearDataRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public ClearDataRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public ClearDataRequest setTenantContext(ClearDataRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ClearDataRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public ClearDataRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class ClearDataRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static ClearDataRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ClearDataRequestTenantContext self = new ClearDataRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ClearDataRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
