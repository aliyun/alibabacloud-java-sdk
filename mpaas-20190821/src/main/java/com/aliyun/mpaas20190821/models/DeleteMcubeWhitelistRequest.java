// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static DeleteMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistRequest self = new DeleteMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

}
