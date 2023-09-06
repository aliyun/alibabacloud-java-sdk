// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceRequest extends TeaModel {
    @NameInMap("RequestUnionId")
    public String requestUnionId;

    @NameInMap("TenantContext")
    public QueryScheduleConferenceRequestTenantContext tenantContext;

    public static QueryScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceRequest self = new QueryScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceRequest setRequestUnionId(String requestUnionId) {
        this.requestUnionId = requestUnionId;
        return this;
    }
    public String getRequestUnionId() {
        return this.requestUnionId;
    }

    public QueryScheduleConferenceRequest setTenantContext(QueryScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
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
