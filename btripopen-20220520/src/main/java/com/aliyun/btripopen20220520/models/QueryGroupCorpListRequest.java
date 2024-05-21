// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryGroupCorpListRequest extends TeaModel {
    @NameInMap("user_id")
    public String userId;

    public static QueryGroupCorpListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupCorpListRequest self = new QueryGroupCorpListRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupCorpListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
