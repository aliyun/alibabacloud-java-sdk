// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMgsApirestRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Format")
    public String format;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMgsApirestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApirestRequest self = new QueryMgsApirestRequest();
        return TeaModel.build(map, self);
    }

}
