// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableSheetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169899</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public GetMultiDimTableSheetRequestTenantContext tenantContext;

    public static GetMultiDimTableSheetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableSheetRequest self = new GetMultiDimTableSheetRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableSheetRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public GetMultiDimTableSheetRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public GetMultiDimTableSheetRequest setTenantContext(GetMultiDimTableSheetRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMultiDimTableSheetRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetMultiDimTableSheetRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMultiDimTableSheetRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableSheetRequestTenantContext self = new GetMultiDimTableSheetRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableSheetRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
