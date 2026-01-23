// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityIdentifyResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityIdentifyResultsResponseBody body;

    public static DeleteSecurityIdentifyResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIdentifyResultsResponse self = new DeleteSecurityIdentifyResultsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIdentifyResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityIdentifyResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityIdentifyResultsResponse setBody(DeleteSecurityIdentifyResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityIdentifyResultsResponseBody getBody() {
        return this.body;
    }

}
