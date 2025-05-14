// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableRequest extends TeaModel {
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
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public UpdateMultiDimTableRequestTenantContext tenantContext;

    public static UpdateMultiDimTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableRequest self = new UpdateMultiDimTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public UpdateMultiDimTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMultiDimTableRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public UpdateMultiDimTableRequest setTenantContext(UpdateMultiDimTableRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateMultiDimTableRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateMultiDimTableRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateMultiDimTableRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableRequestTenantContext self = new UpdateMultiDimTableRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
