// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeMiniTasksRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ListMcubeMiniTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniTasksRequest self = new ListMcubeMiniTasksRequest();
        return TeaModel.build(map, self);
    }

}
