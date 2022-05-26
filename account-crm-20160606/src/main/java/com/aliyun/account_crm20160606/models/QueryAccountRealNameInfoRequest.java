// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountRealNameInfoRequest extends TeaModel {
    @NameInMap("PK")
    public String PK;

    public static QueryAccountRealNameInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountRealNameInfoRequest self = new QueryAccountRealNameInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountRealNameInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
