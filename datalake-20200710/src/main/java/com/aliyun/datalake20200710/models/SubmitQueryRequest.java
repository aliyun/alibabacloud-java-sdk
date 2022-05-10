// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SubmitQueryRequest extends TeaModel {
    @NameInMap("sql")
    public String sql;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryRequest self = new SubmitQueryRequest();
        return TeaModel.build(map, self);
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
