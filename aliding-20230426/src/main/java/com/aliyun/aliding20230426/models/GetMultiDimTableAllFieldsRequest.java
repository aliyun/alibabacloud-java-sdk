// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllFieldsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>338534</p>
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
    public GetMultiDimTableAllFieldsRequestTenantContext tenantContext;

    public static GetMultiDimTableAllFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllFieldsRequest self = new GetMultiDimTableAllFieldsRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllFieldsRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public GetMultiDimTableAllFieldsRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public GetMultiDimTableAllFieldsRequest setTenantContext(GetMultiDimTableAllFieldsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMultiDimTableAllFieldsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetMultiDimTableAllFieldsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMultiDimTableAllFieldsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllFieldsRequestTenantContext self = new GetMultiDimTableAllFieldsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllFieldsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
