// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileTypeStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileTypeStatisticResponseBody body;

    public static GetFileTypeStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileTypeStatisticResponse self = new GetFileTypeStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetFileTypeStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileTypeStatisticResponse setBody(GetFileTypeStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileTypeStatisticResponseBody getBody() {
        return this.body;
    }

}
