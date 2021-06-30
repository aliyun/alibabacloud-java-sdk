// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetListActionsByServiceCodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetListActionsByServiceCodesResponseBody body;

    public static GetListActionsByServiceCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListActionsByServiceCodesResponse self = new GetListActionsByServiceCodesResponse();
        return TeaModel.build(map, self);
    }

    public GetListActionsByServiceCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListActionsByServiceCodesResponse setBody(GetListActionsByServiceCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListActionsByServiceCodesResponseBody getBody() {
        return this.body;
    }

}
