// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMgsTestreqbodyautogenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Format")
    public String format;

    @NameInMap("MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr")
    public String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMgsTestreqbodyautogenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsTestreqbodyautogenRequest self = new QueryMgsTestreqbodyautogenRequest();
        return TeaModel.build(map, self);
    }

}
