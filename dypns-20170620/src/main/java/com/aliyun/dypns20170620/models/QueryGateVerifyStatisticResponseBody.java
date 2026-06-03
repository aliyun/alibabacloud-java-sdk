// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Boolean data;

    public static QueryGateVerifyStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyStatisticResponseBody self = new QueryGateVerifyStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGateVerifyStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGateVerifyStatisticResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
