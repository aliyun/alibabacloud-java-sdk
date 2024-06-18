// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesTextRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryMinutesTextRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static QueryMinutesTextRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesTextRequest self = new QueryMinutesTextRequest();
        return TeaModel.build(map, self);
    }

    public QueryMinutesTextRequest setTenantContext(QueryMinutesTextRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMinutesTextRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryMinutesTextRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryMinutesTextRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public QueryMinutesTextRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryMinutesTextRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class QueryMinutesTextRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMinutesTextRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesTextRequestTenantContext self = new QueryMinutesTextRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesTextRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
