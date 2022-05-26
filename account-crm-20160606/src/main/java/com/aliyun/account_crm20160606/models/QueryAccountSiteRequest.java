// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountSiteRequest extends TeaModel {
    @NameInMap("Pk")
    public String pk;

    public static QueryAccountSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSiteRequest self = new QueryAccountSiteRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountSiteRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
