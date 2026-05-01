// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplateResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelTemplateResourceGroupResponseBody body;

    public static ListModelTemplateResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplateResourceGroupResponse self = new ListModelTemplateResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListModelTemplateResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelTemplateResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelTemplateResourceGroupResponse setBody(ListModelTemplateResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelTemplateResourceGroupResponseBody getBody() {
        return this.body;
    }

}
