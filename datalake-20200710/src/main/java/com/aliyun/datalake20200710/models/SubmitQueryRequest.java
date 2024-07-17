// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SubmitQueryRequest extends TeaModel {
    @NameInMap("catalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>show databases</p>
     */
    @NameInMap("sql")
    public String sql;

    /**
     * <strong>example:</strong>
     * <p>WS-A129E61C4892D2B4</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryRequest self = new SubmitQueryRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQueryRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public SubmitQueryRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public SubmitQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
