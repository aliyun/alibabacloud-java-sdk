// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMPaaSMasTinyAppDailyDataRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Date")
    @Validation(required = true)
    public String date;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("TinyAppId")
    @Validation(required = true)
    public String tinyAppId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMPaaSMasTinyAppDailyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMPaaSMasTinyAppDailyDataRequest self = new QueryMPaaSMasTinyAppDailyDataRequest();
        return TeaModel.build(map, self);
    }

}
