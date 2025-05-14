// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableFieldRequest extends TeaModel {
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
    @NameInMap("FieldIdOrName")
    public String fieldIdOrName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public DeleteMultiDimTableFieldRequestTenantContext tenantContext;

    public static DeleteMultiDimTableFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableFieldRequest self = new DeleteMultiDimTableFieldRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableFieldRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public DeleteMultiDimTableFieldRequest setFieldIdOrName(String fieldIdOrName) {
        this.fieldIdOrName = fieldIdOrName;
        return this;
    }
    public String getFieldIdOrName() {
        return this.fieldIdOrName;
    }

    public DeleteMultiDimTableFieldRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public DeleteMultiDimTableFieldRequest setTenantContext(DeleteMultiDimTableFieldRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteMultiDimTableFieldRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteMultiDimTableFieldRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteMultiDimTableFieldRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMultiDimTableFieldRequestTenantContext self = new DeleteMultiDimTableFieldRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteMultiDimTableFieldRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
