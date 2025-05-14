// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertMultiDimTableRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7nxxxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("Records")
    public java.util.List<InsertMultiDimTableRecordRequestRecords> records;

    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public InsertMultiDimTableRecordRequestTenantContext tenantContext;

    public static InsertMultiDimTableRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertMultiDimTableRecordRequest self = new InsertMultiDimTableRecordRequest();
        return TeaModel.build(map, self);
    }

    public InsertMultiDimTableRecordRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public InsertMultiDimTableRecordRequest setRecords(java.util.List<InsertMultiDimTableRecordRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<InsertMultiDimTableRecordRequestRecords> getRecords() {
        return this.records;
    }

    public InsertMultiDimTableRecordRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public InsertMultiDimTableRecordRequest setTenantContext(InsertMultiDimTableRecordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InsertMultiDimTableRecordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class InsertMultiDimTableRecordRequestRecords extends TeaModel {
        @NameInMap("Fields")
        public java.util.Map<String, ?> fields;

        public static InsertMultiDimTableRecordRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            InsertMultiDimTableRecordRequestRecords self = new InsertMultiDimTableRecordRequestRecords();
            return TeaModel.build(map, self);
        }

        public InsertMultiDimTableRecordRequestRecords setFields(java.util.Map<String, ?> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.Map<String, ?> getFields() {
            return this.fields;
        }

    }

    public static class InsertMultiDimTableRecordRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static InsertMultiDimTableRecordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InsertMultiDimTableRecordRequestTenantContext self = new InsertMultiDimTableRecordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InsertMultiDimTableRecordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
