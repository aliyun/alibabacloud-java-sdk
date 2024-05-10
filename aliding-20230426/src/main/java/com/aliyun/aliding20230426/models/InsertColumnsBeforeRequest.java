// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertColumnsBeforeRequest extends TeaModel {
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
    public InsertColumnsBeforeRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static InsertColumnsBeforeRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertColumnsBeforeRequest self = new InsertColumnsBeforeRequest();
        return TeaModel.build(map, self);
    }

    public InsertColumnsBeforeRequest setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public InsertColumnsBeforeRequest setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public InsertColumnsBeforeRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public InsertColumnsBeforeRequest setTenantContext(InsertColumnsBeforeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InsertColumnsBeforeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public InsertColumnsBeforeRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class InsertColumnsBeforeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static InsertColumnsBeforeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InsertColumnsBeforeRequestTenantContext self = new InsertColumnsBeforeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InsertColumnsBeforeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
