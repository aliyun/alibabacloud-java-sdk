// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetNumberRegionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNumberRegionInfoResponseBody body;

    public static GetNumberRegionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumberRegionInfoResponse self = new GetNumberRegionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetNumberRegionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumberRegionInfoResponse setBody(GetNumberRegionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumberRegionInfoResponseBody getBody() {
        return this.body;
    }

}
