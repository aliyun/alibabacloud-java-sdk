// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WhitelistType")
    @Validation(required = true)
    public String whitelistType;

    @NameInMap("WhiteListName")
    @Validation(required = true)
    public String whiteListName;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistRequest self = new CreateMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

}
