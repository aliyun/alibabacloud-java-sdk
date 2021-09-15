// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDataModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataModelResponseBody body;

    public static GetDataModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataModelResponse self = new GetDataModelResponse();
        return TeaModel.build(map, self);
    }

    public GetDataModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataModelResponse setBody(GetDataModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataModelResponseBody getBody() {
        return this.body;
    }

}
