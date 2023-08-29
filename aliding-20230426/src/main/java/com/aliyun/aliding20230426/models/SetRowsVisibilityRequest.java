// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetRowsVisibilityRequest extends TeaModel {
    @NameInMap("Row")
    public Long row;

    @NameInMap("RowCount")
    public Long rowCount;

    @NameInMap("SheetId")
    public String sheetId;

    @NameInMap("TenantContext")
    public SetRowsVisibilityRequestTenantContext tenantContext;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static SetRowsVisibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRowsVisibilityRequest self = new SetRowsVisibilityRequest();
        return TeaModel.build(map, self);
    }

    public SetRowsVisibilityRequest setRow(Long row) {
        this.row = row;
        return this;
    }
    public Long getRow() {
        return this.row;
    }

    public SetRowsVisibilityRequest setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public SetRowsVisibilityRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public SetRowsVisibilityRequest setTenantContext(SetRowsVisibilityRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SetRowsVisibilityRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public SetRowsVisibilityRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public SetRowsVisibilityRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class SetRowsVisibilityRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SetRowsVisibilityRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SetRowsVisibilityRequestTenantContext self = new SetRowsVisibilityRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SetRowsVisibilityRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
