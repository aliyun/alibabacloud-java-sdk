// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BlockAlarmNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BlockAlarmNotificationResponseBody body;

    public static BlockAlarmNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        BlockAlarmNotificationResponse self = new BlockAlarmNotificationResponse();
        return TeaModel.build(map, self);
    }

    public BlockAlarmNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlockAlarmNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlockAlarmNotificationResponse setBody(BlockAlarmNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public BlockAlarmNotificationResponseBody getBody() {
        return this.body;
    }

}
