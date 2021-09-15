// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateDataModelAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDataModelAttributesResponseBody body;

    public static UpdateDataModelAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataModelAttributesResponse self = new UpdateDataModelAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataModelAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataModelAttributesResponse setBody(UpdateDataModelAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataModelAttributesResponseBody getBody() {
        return this.body;
    }

}
