// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteAbilityConfigByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAbilityConfigByDeviceIdResponseBody body;

    public static DeleteAbilityConfigByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbilityConfigByDeviceIdResponse self = new DeleteAbilityConfigByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAbilityConfigByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAbilityConfigByDeviceIdResponse setBody(DeleteAbilityConfigByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAbilityConfigByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
