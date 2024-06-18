// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public GetSheetRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static GetSheetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSheetRequest self = new GetSheetRequest();
        return TeaModel.build(map, self);
    }

    public GetSheetRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public GetSheetRequest setTenantContext(GetSheetRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetSheetRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetSheetRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class GetSheetRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetSheetRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetSheetRequestTenantContext self = new GetSheetRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetSheetRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
