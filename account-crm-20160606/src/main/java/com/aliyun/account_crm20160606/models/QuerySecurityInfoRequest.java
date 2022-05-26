// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QuerySecurityInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    public static QuerySecurityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityInfoRequest self = new QuerySecurityInfoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySecurityInfoRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
