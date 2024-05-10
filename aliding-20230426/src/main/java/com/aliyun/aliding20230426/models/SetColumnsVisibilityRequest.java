// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetColumnsVisibilityRequest extends TeaModel {
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
    public SetColumnsVisibilityRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static SetColumnsVisibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        SetColumnsVisibilityRequest self = new SetColumnsVisibilityRequest();
        return TeaModel.build(map, self);
    }

    public SetColumnsVisibilityRequest setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public SetColumnsVisibilityRequest setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public SetColumnsVisibilityRequest setSheetId(String sheetId) {
        this.sheetId = sheetId;
        return this;
    }
    public String getSheetId() {
        return this.sheetId;
    }

    public SetColumnsVisibilityRequest setTenantContext(SetColumnsVisibilityRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SetColumnsVisibilityRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public SetColumnsVisibilityRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public SetColumnsVisibilityRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class SetColumnsVisibilityRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SetColumnsVisibilityRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SetColumnsVisibilityRequestTenantContext self = new SetColumnsVisibilityRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SetColumnsVisibilityRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
