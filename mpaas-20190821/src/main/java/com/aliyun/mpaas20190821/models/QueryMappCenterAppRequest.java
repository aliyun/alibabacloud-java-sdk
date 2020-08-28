// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMappCenterAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMappCenterAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMappCenterAppRequest self = new QueryMappCenterAppRequest();
        return TeaModel.build(map, self);
    }

}
