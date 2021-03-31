// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryPersonInfoRequest extends TeaModel {
    // accountUserId
    @NameInMap("AccountUserId")
    public String accountUserId;

    public static QueryPersonInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPersonInfoRequest self = new QueryPersonInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryPersonInfoRequest setAccountUserId(String accountUserId) {
        this.accountUserId = accountUserId;
        return this;
    }
    public String getAccountUserId() {
        return this.accountUserId;
    }

}
