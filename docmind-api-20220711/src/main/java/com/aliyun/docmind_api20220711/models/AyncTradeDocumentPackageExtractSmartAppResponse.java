// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class AyncTradeDocumentPackageExtractSmartAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
