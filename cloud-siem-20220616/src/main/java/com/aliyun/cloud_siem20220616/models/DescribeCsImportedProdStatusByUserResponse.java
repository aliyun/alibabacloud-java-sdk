// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
