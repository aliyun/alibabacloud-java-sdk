// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteColumnsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Column")
    public Long column;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ColumnCount")
    public Long columnCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public DeleteColumnsRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static DeleteColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteColumnsRequest self = new DeleteColumnsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteColumnsRequest setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public DeleteColumnsRequest setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public DeleteColumnsRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public DeleteColumnsRequest setTenantContext(DeleteColumnsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteColumnsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteColumnsRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class DeleteColumnsRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteColumnsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteColumnsRequestTenantContext self = new DeleteColumnsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteColumnsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
