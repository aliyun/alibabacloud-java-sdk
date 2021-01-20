// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMonitorGroupByResourceGroupIdResponseBody body;

    public static CreateMonitorGroupByResourceGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupByResourceGroupIdResponse self = new CreateMonitorGroupByResourceGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupByResourceGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorGroupByResourceGroupIdResponse setBody(CreateMonitorGroupByResourceGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorGroupByResourceGroupIdResponseBody getBody() {
        return this.body;
    }

}
