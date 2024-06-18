// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteRowsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Row")
    public Long row;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RowCount")
    public Long rowCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public DeleteRowsRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static DeleteRowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowsRequest self = new DeleteRowsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRowsRequest setRow(Long row) {
        this.row = row;
        return this;
    }
    public Long getRow() {
        return this.row;
    }

    public DeleteRowsRequest setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public DeleteRowsRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public DeleteRowsRequest setTenantContext(DeleteRowsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteRowsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteRowsRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class DeleteRowsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteRowsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteRowsRequestTenantContext self = new DeleteRowsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteRowsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
