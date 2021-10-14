// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class EditApgroupThirdAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditApgroupThirdAppResponseBody body;

    public static EditApgroupThirdAppResponse build(java.util.Map<String, ?> map) throws Exception {
        EditApgroupThirdAppResponse self = new EditApgroupThirdAppResponse();
        return TeaModel.build(map, self);
    }

    public EditApgroupThirdAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditApgroupThirdAppResponse setBody(EditApgroupThirdAppResponseBody body) {
        this.body = body;
        return this;
    }
    public EditApgroupThirdAppResponseBody getBody() {
        return this.body;
    }

}
