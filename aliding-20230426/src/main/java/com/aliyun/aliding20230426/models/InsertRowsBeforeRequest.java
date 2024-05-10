// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertRowsBeforeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Row")
    public Long row;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RowCount")
    public Long rowCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public InsertRowsBeforeRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static InsertRowsBeforeRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRowsBeforeRequest self = new InsertRowsBeforeRequest();
        return TeaModel.build(map, self);
    }

    public InsertRowsBeforeRequest setRow(Long row) {
        this.row = row;
        return this;
    }
    public Long getRow() {
        return this.row;
    }

    public InsertRowsBeforeRequest setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public InsertRowsBeforeRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public InsertRowsBeforeRequest setTenantContext(InsertRowsBeforeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InsertRowsBeforeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public InsertRowsBeforeRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class InsertRowsBeforeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static InsertRowsBeforeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InsertRowsBeforeRequestTenantContext self = new InsertRowsBeforeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InsertRowsBeforeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
