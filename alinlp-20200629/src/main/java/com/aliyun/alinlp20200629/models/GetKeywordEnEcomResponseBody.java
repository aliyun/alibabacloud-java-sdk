// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetKeywordEnEcomResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetKeywordEnEcomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordEnEcomResponseBody self = new GetKeywordEnEcomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeywordEnEcomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetKeywordEnEcomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
