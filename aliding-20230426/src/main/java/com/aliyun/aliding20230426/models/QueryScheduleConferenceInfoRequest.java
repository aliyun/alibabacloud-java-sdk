// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>636cf59f2b032f014ae32902</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
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
