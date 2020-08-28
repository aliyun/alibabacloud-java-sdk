// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniTaskRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMcubeMiniTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniTaskRequest self = new QueryMcubeMiniTaskRequest();
        return TeaModel.build(map, self);
    }

}
