// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeVhostRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("Vhost")
    @Validation(required = true)
    public String vhost;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateMcubeVhostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeVhostRequest self = new CreateMcubeVhostRequest();
        return TeaModel.build(map, self);
    }

}
