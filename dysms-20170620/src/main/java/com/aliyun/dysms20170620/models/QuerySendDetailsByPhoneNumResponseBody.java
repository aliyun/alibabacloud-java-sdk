// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendDetailsByPhoneNumResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static QuerySendDetailsByPhoneNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsByPhoneNumResponseBody self = new QuerySendDetailsByPhoneNumResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsByPhoneNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySendDetailsByPhoneNumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySendDetailsByPhoneNumResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
