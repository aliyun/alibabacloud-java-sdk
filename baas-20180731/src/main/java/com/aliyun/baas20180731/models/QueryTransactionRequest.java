// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryTransactionRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Hash")
    public String hash;

    public static QueryTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTransactionRequest self = new QueryTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTransactionRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryTransactionRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
