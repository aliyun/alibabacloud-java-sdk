// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableFullInfoResponseBody body;

    public static GetMetaTableFullInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoResponse self = new GetMetaTableFullInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableFullInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableFullInfoResponse setBody(GetMetaTableFullInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableFullInfoResponseBody getBody() {
        return this.body;
    }

}
