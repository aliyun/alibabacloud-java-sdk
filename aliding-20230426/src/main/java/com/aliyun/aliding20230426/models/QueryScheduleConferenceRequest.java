// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryScheduleConferenceRequestTenantContext tenantContext;

    @NameInMap("scheduleConferenceId")
    public String scheduleConferenceId;

    public static QueryScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceRequest self = new QueryScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceRequest setTenantContext(QueryScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryScheduleConferenceRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public static class QueryScheduleConferenceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryScheduleConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryScheduleConferenceRequestTenantContext self = new QueryScheduleConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryScheduleConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
