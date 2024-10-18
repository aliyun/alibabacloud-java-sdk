// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTicketOperateRecordRequest extends TeaModel {
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
    public ListTicketOperateRecordRequestTenantContext tenantContext;

    public static ListTicketOperateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketOperateRecordRequest self = new ListTicketOperateRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketOperateRecordRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public ListTicketOperateRecordRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public ListTicketOperateRecordRequest setTenantContext(ListTicketOperateRecordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListTicketOperateRecordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListTicketOperateRecordRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListTicketOperateRecordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordRequestTenantContext self = new ListTicketOperateRecordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
