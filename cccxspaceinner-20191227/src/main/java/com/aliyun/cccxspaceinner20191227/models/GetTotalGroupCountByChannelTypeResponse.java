// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTotalGroupCountByChannelTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTotalGroupCountByChannelTypeResponseBody body;

    public static GetTotalGroupCountByChannelTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalGroupCountByChannelTypeResponse self = new GetTotalGroupCountByChannelTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetTotalGroupCountByChannelTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTotalGroupCountByChannelTypeResponse setBody(GetTotalGroupCountByChannelTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTotalGroupCountByChannelTypeResponseBody getBody() {
        return this.body;
    }

}
