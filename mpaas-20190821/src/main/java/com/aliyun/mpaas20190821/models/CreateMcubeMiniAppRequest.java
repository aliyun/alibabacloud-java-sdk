// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("H5Id")
    @Validation(required = true)
    public String h5Id;

    @NameInMap("H5Name")
    @Validation(required = true)
    public String h5Name;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateMcubeMiniAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniAppRequest self = new CreateMcubeMiniAppRequest();
        return TeaModel.build(map, self);
    }

}
