// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionWhiteDevicesByDeviceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVersionWhiteDevicesByDeviceGroupsResponseBody body;

    public static AddVersionWhiteDevicesByDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVersionWhiteDevicesByDeviceGroupsResponse self = new AddVersionWhiteDevicesByDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponse setBody(AddVersionWhiteDevicesByDeviceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVersionWhiteDevicesByDeviceGroupsResponseBody getBody() {
        return this.body;
    }

}
