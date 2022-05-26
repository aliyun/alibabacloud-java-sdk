// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEncryptedAccountProfileInfoRequest extends TeaModel {
    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryEncryptedAccountProfileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEncryptedAccountProfileInfoRequest self = new QueryEncryptedAccountProfileInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEncryptedAccountProfileInfoRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryEncryptedAccountProfileInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
