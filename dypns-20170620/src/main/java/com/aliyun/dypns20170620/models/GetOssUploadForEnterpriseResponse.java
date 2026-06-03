// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetOssUploadForEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssUploadForEnterpriseResponseBody body;

    public static GetOssUploadForEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadForEnterpriseResponse self = new GetOssUploadForEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadForEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadForEnterpriseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUploadForEnterpriseResponse setBody(GetOssUploadForEnterpriseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadForEnterpriseResponseBody getBody() {
        return this.body;
    }

}
