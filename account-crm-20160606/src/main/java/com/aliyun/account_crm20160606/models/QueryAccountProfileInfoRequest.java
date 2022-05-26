// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountProfileInfoRequest extends TeaModel {
    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryAccountProfileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountProfileInfoRequest self = new QueryAccountProfileInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountProfileInfoRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryAccountProfileInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
