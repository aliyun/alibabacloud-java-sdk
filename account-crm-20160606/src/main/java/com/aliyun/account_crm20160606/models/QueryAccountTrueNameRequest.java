// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountTrueNameRequest extends TeaModel {
    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryAccountTrueNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTrueNameRequest self = new QueryAccountTrueNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTrueNameRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryAccountTrueNameRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
