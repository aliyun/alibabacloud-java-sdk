// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class IsSupportPFSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IsSupportPFSResponseBody body;

    public static IsSupportPFSResponse build(java.util.Map<String, ?> map) throws Exception {
        IsSupportPFSResponse self = new IsSupportPFSResponse();
        return TeaModel.build(map, self);
    }

    public IsSupportPFSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsSupportPFSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsSupportPFSResponse setBody(IsSupportPFSResponseBody body) {
        this.body = body;
        return this;
    }
    public IsSupportPFSResponseBody getBody() {
        return this.body;
    }

}
