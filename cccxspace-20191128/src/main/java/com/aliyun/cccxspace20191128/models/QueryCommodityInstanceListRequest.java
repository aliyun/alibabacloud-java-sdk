// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QueryCommodityInstanceListRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    public static QueryCommodityInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityInstanceListRequest self = new QueryCommodityInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityInstanceListRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

}
