// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSqlOptimizeAdviceResponseBody body;

    public static GetSqlOptimizeAdviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlOptimizeAdviceResponse self = new GetSqlOptimizeAdviceResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlOptimizeAdviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlOptimizeAdviceResponse setBody(GetSqlOptimizeAdviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlOptimizeAdviceResponseBody getBody() {
        return this.body;
    }

}
