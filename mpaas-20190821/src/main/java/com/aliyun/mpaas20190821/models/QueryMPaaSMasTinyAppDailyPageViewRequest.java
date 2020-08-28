// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMPaaSMasTinyAppDailyPageViewRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Date")
    @Validation(required = true)
    public String date;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    @Validation(required = true)
    public String order;

    @NameInMap("OrderCol")
    @Validation(required = true)
    public String orderCol;

    @NameInMap("PageLen")
    @Validation(required = true)
    public String pageLen;

    @NameInMap("PageNum")
    @Validation(required = true)
    public String pageNum;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("TinyAppId")
    @Validation(required = true)
    public String tinyAppId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMPaaSMasTinyAppDailyPageViewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMPaaSMasTinyAppDailyPageViewRequest self = new QueryMPaaSMasTinyAppDailyPageViewRequest();
        return TeaModel.build(map, self);
    }

}
