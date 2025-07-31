// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiDocumentResponseBody body;

    public static GetDataServiceApiDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiDocumentResponse self = new GetDataServiceApiDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiDocumentResponse setBody(GetDataServiceApiDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiDocumentResponseBody getBody() {
        return this.body;
    }

}
