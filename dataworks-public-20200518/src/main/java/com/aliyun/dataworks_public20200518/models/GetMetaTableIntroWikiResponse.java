// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableIntroWikiResponseBody body;

    public static GetMetaTableIntroWikiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiResponse self = new GetMetaTableIntroWikiResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableIntroWikiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableIntroWikiResponse setBody(GetMetaTableIntroWikiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableIntroWikiResponseBody getBody() {
        return this.body;
    }

}
