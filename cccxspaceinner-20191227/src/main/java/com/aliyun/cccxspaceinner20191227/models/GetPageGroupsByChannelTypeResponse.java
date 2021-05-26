// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByChannelTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPageGroupsByChannelTypeResponseBody body;

    public static GetPageGroupsByChannelTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByChannelTypeResponse self = new GetPageGroupsByChannelTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByChannelTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageGroupsByChannelTypeResponse setBody(GetPageGroupsByChannelTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageGroupsByChannelTypeResponseBody getBody() {
        return this.body;
    }

}
