// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableDetailInfoResponseBody body;

    public static GetMetaTableDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableDetailInfoResponse self = new GetMetaTableDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableDetailInfoResponse setBody(GetMetaTableDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableDetailInfoResponseBody getBody() {
        return this.body;
    }

}
