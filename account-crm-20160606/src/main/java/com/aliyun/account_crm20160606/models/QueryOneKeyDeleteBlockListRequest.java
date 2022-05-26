// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryOneKeyDeleteBlockListRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    public static QueryOneKeyDeleteBlockListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOneKeyDeleteBlockListRequest self = new QueryOneKeyDeleteBlockListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOneKeyDeleteBlockListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryOneKeyDeleteBlockListRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
