// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryTagV2ResponseBody body;

    public static DeleteRepositoryTagV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagV2Response self = new DeleteRepositoryTagV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryTagV2Response setBody(DeleteRepositoryTagV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryTagV2ResponseBody getBody() {
        return this.body;
    }

}
