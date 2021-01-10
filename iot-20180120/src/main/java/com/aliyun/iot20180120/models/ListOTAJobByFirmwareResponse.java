// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOTAJobByFirmwareResponseBody body;

    public static ListOTAJobByFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByFirmwareResponse self = new ListOTAJobByFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAJobByFirmwareResponse setBody(ListOTAJobByFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAJobByFirmwareResponseBody getBody() {
        return this.body;
    }

}
