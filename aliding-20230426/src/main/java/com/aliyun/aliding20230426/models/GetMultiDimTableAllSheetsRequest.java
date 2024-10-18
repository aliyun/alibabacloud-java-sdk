// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllSheetsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>144972</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("TenantContext")
    public GetMultiDimTableAllSheetsRequestTenantContext tenantContext;

    public static GetMultiDimTableAllSheetsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllSheetsRequest self = new GetMultiDimTableAllSheetsRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllSheetsRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public GetMultiDimTableAllSheetsRequest setTenantContext(GetMultiDimTableAllSheetsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMultiDimTableAllSheetsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetMultiDimTableAllSheetsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMultiDimTableAllSheetsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllSheetsRequestTenantContext self = new GetMultiDimTableAllSheetsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllSheetsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
