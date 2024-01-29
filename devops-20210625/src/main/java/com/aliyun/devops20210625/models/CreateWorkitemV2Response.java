// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkitemV2ResponseBody body;

    public static CreateWorkitemV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemV2Response self = new CreateWorkitemV2Response();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkitemV2Response setBody(CreateWorkitemV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemV2ResponseBody getBody() {
        return this.body;
    }

}
