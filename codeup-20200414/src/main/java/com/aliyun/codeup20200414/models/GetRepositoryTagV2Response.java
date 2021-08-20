// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryTagV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepositoryTagV2ResponseBody body;

    public static GetRepositoryTagV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryTagV2Response self = new GetRepositoryTagV2Response();
        return TeaModel.build(map, self);
    }

    public GetRepositoryTagV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepositoryTagV2Response setBody(GetRepositoryTagV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepositoryTagV2ResponseBody getBody() {
        return this.body;
    }

}
