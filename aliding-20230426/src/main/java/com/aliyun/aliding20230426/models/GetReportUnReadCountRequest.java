// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportUnReadCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    @NameInMap("TenantContext")
    public GetReportUnReadCountRequestTenantContext tenantContext;

    public static GetReportUnReadCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportUnReadCountRequest self = new GetReportUnReadCountRequest();
        return TeaModel.build(map, self);
    }

    public GetReportUnReadCountRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

    public GetReportUnReadCountRequest setTenantContext(GetReportUnReadCountRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetReportUnReadCountRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetReportUnReadCountRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetReportUnReadCountRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetReportUnReadCountRequestTenantContext self = new GetReportUnReadCountRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetReportUnReadCountRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
