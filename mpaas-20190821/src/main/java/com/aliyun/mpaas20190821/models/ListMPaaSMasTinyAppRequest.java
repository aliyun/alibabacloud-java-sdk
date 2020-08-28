// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMPaaSMasTinyAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ListMPaaSMasTinyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMPaaSMasTinyAppRequest self = new ListMPaaSMasTinyAppRequest();
        return TeaModel.build(map, self);
    }

}
