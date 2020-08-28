// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("WhitelistValue")
    @Validation(required = true)
    public String whitelistValue;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateMcubeWhitelistForIdeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistForIdeRequest self = new CreateMcubeWhitelistForIdeRequest();
        return TeaModel.build(map, self);
    }

}
