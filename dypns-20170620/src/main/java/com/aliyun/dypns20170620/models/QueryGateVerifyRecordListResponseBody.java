// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyRecordListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Boolean data;

    public static QueryGateVerifyRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyRecordListResponseBody self = new QueryGateVerifyRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGateVerifyRecordListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGateVerifyRecordListResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
