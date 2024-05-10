// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordTextRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public QueryCloudRecordTextRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryCloudRecordTextRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordTextRequest self = new QueryCloudRecordTextRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordTextRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public QueryCloudRecordTextRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryCloudRecordTextRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public QueryCloudRecordTextRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryCloudRecordTextRequest setTenantContext(QueryCloudRecordTextRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryCloudRecordTextRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryCloudRecordTextRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class QueryCloudRecordTextRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryCloudRecordTextRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordTextRequestTenantContext self = new QueryCloudRecordTextRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordTextRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
