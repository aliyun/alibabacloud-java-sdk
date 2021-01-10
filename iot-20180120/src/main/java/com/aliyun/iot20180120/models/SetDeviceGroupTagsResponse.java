// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceGroupTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDeviceGroupTagsResponseBody body;

    public static SetDeviceGroupTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceGroupTagsResponse self = new SetDeviceGroupTagsResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceGroupTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceGroupTagsResponse setBody(SetDeviceGroupTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceGroupTagsResponseBody getBody() {
        return this.body;
    }

}
