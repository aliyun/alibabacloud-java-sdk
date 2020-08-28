// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeMiniAppsRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ListMcubeMiniAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniAppsRequest self = new ListMcubeMiniAppsRequest();
        return TeaModel.build(map, self);
    }

}
