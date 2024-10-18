// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTicketRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKWh3xxxxiE</p>
     */
    @NameInMap("OpenTeamId")
    public String openTeamId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dq9hP8Sk2v6vQxxxxiE</p>
     */
    @NameInMap("OpenTicketId")
    public String openTicketId;

    @NameInMap("TenantContext")
    public GetTicketRequestTenantContext tenantContext;

    public static GetTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketRequest self = new GetTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public GetTicketRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public GetTicketRequest setTenantContext(GetTicketRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetTicketRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetTicketRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetTicketRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetTicketRequestTenantContext self = new GetTicketRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetTicketRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
