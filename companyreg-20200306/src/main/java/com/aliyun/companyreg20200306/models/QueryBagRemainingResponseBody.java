// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryBagRemainingResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryBagRemainingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBagRemainingResponseBody self = new QueryBagRemainingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBagRemainingResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public QueryBagRemainingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
