// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveResourceGroupModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveResourceGroupModelTemplateResponseBody body;

    public static RemoveResourceGroupModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveResourceGroupModelTemplateResponse self = new RemoveResourceGroupModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveResourceGroupModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveResourceGroupModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveResourceGroupModelTemplateResponse setBody(RemoveResourceGroupModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveResourceGroupModelTemplateResponseBody getBody() {
        return this.body;
    }

}
