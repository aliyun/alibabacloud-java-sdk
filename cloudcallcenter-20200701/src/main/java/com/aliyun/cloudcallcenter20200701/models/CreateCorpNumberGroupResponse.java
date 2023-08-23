// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateCorpNumberGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCorpNumberGroupResponseBody body;

    public static CreateCorpNumberGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpNumberGroupResponse self = new CreateCorpNumberGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCorpNumberGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCorpNumberGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCorpNumberGroupResponse setBody(CreateCorpNumberGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCorpNumberGroupResponseBody getBody() {
        return this.body;
    }

}
