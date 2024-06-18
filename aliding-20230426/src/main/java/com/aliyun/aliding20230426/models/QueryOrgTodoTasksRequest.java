// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgTodoTasksRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryOrgTodoTasksRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isDone")
    public Boolean isDone;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static QueryOrgTodoTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgTodoTasksRequest self = new QueryOrgTodoTasksRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrgTodoTasksRequest setTenantContext(QueryOrgTodoTasksRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryOrgTodoTasksRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryOrgTodoTasksRequest setIsDone(Boolean isDone) {
        this.isDone = isDone;
        return this;
    }
    public Boolean getIsDone() {
        return this.isDone;
    }

    public QueryOrgTodoTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class QueryOrgTodoTasksRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryOrgTodoTasksRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgTodoTasksRequestTenantContext self = new QueryOrgTodoTasksRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryOrgTodoTasksRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
