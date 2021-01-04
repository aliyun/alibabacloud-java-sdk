// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableColumnResponseBody body;

    public static GetMetaTableColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponse self = new GetMetaTableColumnResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableColumnResponse setBody(GetMetaTableColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableColumnResponseBody getBody() {
        return this.body;
    }

}
