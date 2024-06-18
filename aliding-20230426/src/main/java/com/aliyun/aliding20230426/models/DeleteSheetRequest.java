// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSheetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public DeleteSheetRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static DeleteSheetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSheetRequest self = new DeleteSheetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSheetRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public DeleteSheetRequest setTenantContext(DeleteSheetRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteSheetRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteSheetRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class DeleteSheetRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteSheetRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteSheetRequestTenantContext self = new DeleteSheetRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteSheetRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
