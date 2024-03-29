// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetBasicInfoForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBasicInfoForAccountResponseBody body;

    public static GetBasicInfoForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoForAccountResponse self = new GetBasicInfoForAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicInfoForAccountResponse setBody(GetBasicInfoForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicInfoForAccountResponseBody getBody() {
        return this.body;
    }

}
