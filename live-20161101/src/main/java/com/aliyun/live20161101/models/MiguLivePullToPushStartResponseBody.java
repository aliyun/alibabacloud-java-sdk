// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("timestamp")
    public String timestamp;

    public static MiguLivePullToPushStartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStartResponseBody self = new MiguLivePullToPushStartResponseBody();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MiguLivePullToPushStartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MiguLivePullToPushStartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MiguLivePullToPushStartResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
