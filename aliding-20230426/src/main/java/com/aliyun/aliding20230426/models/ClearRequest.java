// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearRequest extends TeaModel {
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
    public ClearRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static ClearRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearRequest self = new ClearRequest();
        return TeaModel.build(map, self);
    }

    public ClearRequest setRangeAddress(String rangeAddress) {
        this.rangeAddress = rangeAddress;
        return this;
    }
    public String getRangeAddress() {
        return this.rangeAddress;
    }

    public ClearRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public ClearRequest setTenantContext(ClearRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ClearRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public ClearRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class ClearRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static ClearRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ClearRequestTenantContext self = new ClearRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ClearRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
