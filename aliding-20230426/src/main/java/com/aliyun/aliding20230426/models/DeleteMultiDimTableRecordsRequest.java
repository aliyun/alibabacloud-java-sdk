// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7nxxxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordIds")
    public java.util.List<String> recordIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public DeleteMultiDimTableRecordsRequestTenantContext tenantContext;

    public static DeleteMultiDimTableRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableRecordsRequest self = new DeleteMultiDimTableRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableRecordsRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public DeleteMultiDimTableRecordsRequest setRecordIds(java.util.List<String> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<String> getRecordIds() {
        return this.recordIds;
    }

    public DeleteMultiDimTableRecordsRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public DeleteMultiDimTableRecordsRequest setTenantContext(DeleteMultiDimTableRecordsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteMultiDimTableRecordsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteMultiDimTableRecordsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteMultiDimTableRecordsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMultiDimTableRecordsRequestTenantContext self = new DeleteMultiDimTableRecordsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteMultiDimTableRecordsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
