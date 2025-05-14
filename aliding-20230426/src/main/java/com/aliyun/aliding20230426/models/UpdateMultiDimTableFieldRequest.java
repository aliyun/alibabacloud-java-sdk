// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableFieldRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7noNyJxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FieldIdOrName")
    public String fieldIdOrName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Property")
    public java.util.Map<String, ?> property;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public UpdateMultiDimTableFieldRequestTenantContext tenantContext;

    public static UpdateMultiDimTableFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableFieldRequest self = new UpdateMultiDimTableFieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableFieldRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public UpdateMultiDimTableFieldRequest setFieldIdOrName(String fieldIdOrName) {
        this.fieldIdOrName = fieldIdOrName;
        return this;
    }
    public String getFieldIdOrName() {
        return this.fieldIdOrName;
    }

    public UpdateMultiDimTableFieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMultiDimTableFieldRequest setProperty(java.util.Map<String, ?> property) {
        this.property = property;
        return this;
    }
    public java.util.Map<String, ?> getProperty() {
        return this.property;
    }

    public UpdateMultiDimTableFieldRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public UpdateMultiDimTableFieldRequest setTenantContext(UpdateMultiDimTableFieldRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateMultiDimTableFieldRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateMultiDimTableFieldRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateMultiDimTableFieldRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableFieldRequestTenantContext self = new UpdateMultiDimTableFieldRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableFieldRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
