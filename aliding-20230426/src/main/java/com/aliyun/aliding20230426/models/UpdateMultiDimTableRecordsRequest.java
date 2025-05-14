// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableRecordsRequest extends TeaModel {
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
    public java.util.List<UpdateMultiDimTableRecordsRequestRecordIds> recordIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public UpdateMultiDimTableRecordsRequestTenantContext tenantContext;

    public static UpdateMultiDimTableRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableRecordsRequest self = new UpdateMultiDimTableRecordsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableRecordsRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public UpdateMultiDimTableRecordsRequest setRecordIds(java.util.List<UpdateMultiDimTableRecordsRequestRecordIds> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<UpdateMultiDimTableRecordsRequestRecordIds> getRecordIds() {
        return this.recordIds;
    }

    public UpdateMultiDimTableRecordsRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public UpdateMultiDimTableRecordsRequest setTenantContext(UpdateMultiDimTableRecordsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateMultiDimTableRecordsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateMultiDimTableRecordsRequestRecordIds extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Fields")
        public java.util.Map<String, ?> fields;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HyDGtSj</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateMultiDimTableRecordsRequestRecordIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableRecordsRequestRecordIds self = new UpdateMultiDimTableRecordsRequestRecordIds();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableRecordsRequestRecordIds setFields(java.util.Map<String, ?> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.Map<String, ?> getFields() {
            return this.fields;
        }

        public UpdateMultiDimTableRecordsRequestRecordIds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UpdateMultiDimTableRecordsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateMultiDimTableRecordsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableRecordsRequestTenantContext self = new UpdateMultiDimTableRecordsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableRecordsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
