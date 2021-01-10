// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListDeployTaskByModelIdAndDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployTaskByModelIdAndDevicesResponseBody body;

    public static ListDeployTaskByModelIdAndDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployTaskByModelIdAndDevicesResponse self = new ListDeployTaskByModelIdAndDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployTaskByModelIdAndDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployTaskByModelIdAndDevicesResponse setBody(ListDeployTaskByModelIdAndDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployTaskByModelIdAndDevicesResponseBody getBody() {
        return this.body;
    }

}
