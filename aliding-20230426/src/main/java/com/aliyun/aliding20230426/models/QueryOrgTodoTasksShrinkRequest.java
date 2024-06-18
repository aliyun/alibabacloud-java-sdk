// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgTodoTasksShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

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

    public static QueryOrgTodoTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgTodoTasksShrinkRequest self = new QueryOrgTodoTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrgTodoTasksShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public QueryOrgTodoTasksShrinkRequest setIsDone(Boolean isDone) {
        this.isDone = isDone;
        return this;
    }
    public Boolean getIsDone() {
        return this.isDone;
    }

    public QueryOrgTodoTasksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
