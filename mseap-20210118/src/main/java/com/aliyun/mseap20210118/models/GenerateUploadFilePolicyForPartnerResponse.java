// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUploadFilePolicyForPartnerResponseBody body;

    public static GenerateUploadFilePolicyForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyForPartnerResponse self = new GenerateUploadFilePolicyForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadFilePolicyForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadFilePolicyForPartnerResponse setBody(GenerateUploadFilePolicyForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadFilePolicyForPartnerResponseBody getBody() {
        return this.body;
    }

}
