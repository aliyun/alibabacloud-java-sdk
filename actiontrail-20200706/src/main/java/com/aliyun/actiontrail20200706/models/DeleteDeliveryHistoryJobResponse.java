// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDeliveryHistoryJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeliveryHistoryJobResponseBody body;

    public static DeleteDeliveryHistoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryHistoryJobResponse self = new DeleteDeliveryHistoryJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryHistoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeliveryHistoryJobResponse setBody(DeleteDeliveryHistoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

}
