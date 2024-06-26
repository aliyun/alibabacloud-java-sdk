// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DuplicateAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DuplicateAntChainContractProjectResponseBody body;

    public static DuplicateAntChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DuplicateAntChainContractProjectResponse self = new DuplicateAntChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public DuplicateAntChainContractProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DuplicateAntChainContractProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DuplicateAntChainContractProjectResponse setBody(DuplicateAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DuplicateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}
