// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCsImportedProdStatusByUserResponseBody body;

    public static DescribeCsImportedProdStatusByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCsImportedProdStatusByUserResponse self = new DescribeCsImportedProdStatusByUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCsImportedProdStatusByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCsImportedProdStatusByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCsImportedProdStatusByUserResponse setBody(DescribeCsImportedProdStatusByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCsImportedProdStatusByUserResponseBody getBody() {
        return this.body;
    }

}
