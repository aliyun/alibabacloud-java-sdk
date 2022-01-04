// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataApiCallUsagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaDataApiCallUsagesResponseBody body;

    public static GetMetaDataApiCallUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataApiCallUsagesResponse self = new GetMetaDataApiCallUsagesResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDataApiCallUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaDataApiCallUsagesResponse setBody(GetMetaDataApiCallUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaDataApiCallUsagesResponseBody getBody() {
        return this.body;
    }

}
