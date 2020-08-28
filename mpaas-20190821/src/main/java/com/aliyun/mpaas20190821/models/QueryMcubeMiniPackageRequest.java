// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("H5Id")
    @Validation(required = true)
    public String h5Id;

    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMcubeMiniPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageRequest self = new QueryMcubeMiniPackageRequest();
        return TeaModel.build(map, self);
    }

}
