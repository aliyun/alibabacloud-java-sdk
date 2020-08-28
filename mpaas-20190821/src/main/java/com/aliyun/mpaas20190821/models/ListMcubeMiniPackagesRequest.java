// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeMiniPackagesRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("H5Id")
    @Validation(required = true)
    public String h5Id;

    @NameInMap("PackageTypes")
    @Validation(required = true)
    public String packageTypes;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ListMcubeMiniPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniPackagesRequest self = new ListMcubeMiniPackagesRequest();
        return TeaModel.build(map, self);
    }

}
