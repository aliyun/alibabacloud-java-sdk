// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFolderTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkTemplateFolderTreeResponseBody body;

    public static GetSparkTemplateFolderTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFolderTreeResponse self = new GetSparkTemplateFolderTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFolderTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkTemplateFolderTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkTemplateFolderTreeResponse setBody(GetSparkTemplateFolderTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkTemplateFolderTreeResponseBody getBody() {
        return this.body;
    }

}
