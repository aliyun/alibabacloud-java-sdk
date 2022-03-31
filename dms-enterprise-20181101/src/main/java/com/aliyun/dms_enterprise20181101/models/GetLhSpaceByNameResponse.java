// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLhSpaceByNameResponseBody body;

    public static GetLhSpaceByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLhSpaceByNameResponse self = new GetLhSpaceByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetLhSpaceByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLhSpaceByNameResponse setBody(GetLhSpaceByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLhSpaceByNameResponseBody getBody() {
        return this.body;
    }

}
