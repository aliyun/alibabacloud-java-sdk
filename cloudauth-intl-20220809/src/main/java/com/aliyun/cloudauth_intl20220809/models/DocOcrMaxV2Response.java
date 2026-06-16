// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocOcrMaxV2ResponseBody body;

    public static DocOcrMaxV2Response build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxV2Response self = new DocOcrMaxV2Response();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocOcrMaxV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocOcrMaxV2Response setBody(DocOcrMaxV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DocOcrMaxV2ResponseBody getBody() {
        return this.body;
    }

}
