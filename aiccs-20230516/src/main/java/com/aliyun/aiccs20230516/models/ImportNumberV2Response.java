// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportNumberV2ResponseBody body;

    public static ImportNumberV2Response build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberV2Response self = new ImportNumberV2Response();
        return TeaModel.build(map, self);
    }

    public ImportNumberV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportNumberV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportNumberV2Response setBody(ImportNumberV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportNumberV2ResponseBody getBody() {
        return this.body;
    }

}
