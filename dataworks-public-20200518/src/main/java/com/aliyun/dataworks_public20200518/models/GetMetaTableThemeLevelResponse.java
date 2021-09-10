// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableThemeLevelResponseBody body;

    public static GetMetaTableThemeLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelResponse self = new GetMetaTableThemeLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableThemeLevelResponse setBody(GetMetaTableThemeLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableThemeLevelResponseBody getBody() {
        return this.body;
    }

}
