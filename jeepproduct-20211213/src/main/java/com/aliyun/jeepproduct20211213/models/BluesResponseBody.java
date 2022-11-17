// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class BluesResponseBody extends TeaModel {
    @NameInMap("Blue")
    public String blue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    @NameInMap("status")
    public String status;

    public static BluesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BluesResponseBody self = new BluesResponseBody();
        return TeaModel.build(map, self);
    }

    public BluesResponseBody setBlue(String blue) {
        this.blue = blue;
        return this;
    }
    public String getBlue() {
        return this.blue;
    }

    public BluesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BluesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public BluesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
