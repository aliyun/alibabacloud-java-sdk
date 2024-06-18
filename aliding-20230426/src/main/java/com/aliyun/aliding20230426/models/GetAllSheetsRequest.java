// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAllSheetsRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetAllSheetsRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("WorkbookId")
    public String workbookId;

    public static GetAllSheetsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllSheetsRequest self = new GetAllSheetsRequest();
        return TeaModel.build(map, self);
    }

    public GetAllSheetsRequest setTenantContext(GetAllSheetsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetAllSheetsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetAllSheetsRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class GetAllSheetsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetAllSheetsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetAllSheetsRequestTenantContext self = new GetAllSheetsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetAllSheetsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
