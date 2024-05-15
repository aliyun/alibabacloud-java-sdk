// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceInfoRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("TenantContext")
    public QueryScheduleConferenceInfoRequestTenantContext tenantContext;

    public static QueryScheduleConferenceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceInfoRequest self = new QueryScheduleConferenceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryScheduleConferenceInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryScheduleConferenceInfoRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public QueryScheduleConferenceInfoRequest setTenantContext(QueryScheduleConferenceInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryScheduleConferenceInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryScheduleConferenceInfoRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryScheduleConferenceInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryScheduleConferenceInfoRequestTenantContext self = new QueryScheduleConferenceInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryScheduleConferenceInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
