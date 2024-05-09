// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class AyncTradeDocumentPackageExtractSmartAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AyncTradeDocumentPackageExtractSmartAppResponseBody body;

    public static AyncTradeDocumentPackageExtractSmartAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AyncTradeDocumentPackageExtractSmartAppResponse self = new AyncTradeDocumentPackageExtractSmartAppResponse();
        return TeaModel.build(map, self);
    }

    public AyncTradeDocumentPackageExtractSmartAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponse setBody(AyncTradeDocumentPackageExtractSmartAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AyncTradeDocumentPackageExtractSmartAppResponseBody getBody() {
        return this.body;
    }

}
