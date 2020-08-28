// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ExistMcubeRsaKeyRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ExistMcubeRsaKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistMcubeRsaKeyRequest self = new ExistMcubeRsaKeyRequest();
        return TeaModel.build(map, self);
    }

}
