// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocOcrV2ResponseBody body;

    public static DocOcrV2Response build(java.util.Map<String, ?> map) throws Exception {
        DocOcrV2Response self = new DocOcrV2Response();
        return TeaModel.build(map, self);
    }

    public DocOcrV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocOcrV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocOcrV2Response setBody(DocOcrV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DocOcrV2ResponseBody getBody() {
        return this.body;
    }

}
