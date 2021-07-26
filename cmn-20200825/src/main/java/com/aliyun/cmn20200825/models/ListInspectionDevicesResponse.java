// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInspectionDevicesResponseBody body;

    public static ListInspectionDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionDevicesResponse self = new ListInspectionDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListInspectionDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInspectionDevicesResponse setBody(ListInspectionDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInspectionDevicesResponseBody getBody() {
        return this.body;
    }

}
