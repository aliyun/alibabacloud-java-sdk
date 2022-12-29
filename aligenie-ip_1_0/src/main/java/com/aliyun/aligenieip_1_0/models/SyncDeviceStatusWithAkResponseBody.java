// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SyncDeviceStatusWithAkResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    @NameInMap("requestId")
    public String requestId;

    public static SyncDeviceStatusWithAkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceStatusWithAkResponseBody self = new SyncDeviceStatusWithAkResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncDeviceStatusWithAkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncDeviceStatusWithAkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public SyncDeviceStatusWithAkResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDeviceStatusWithAkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
