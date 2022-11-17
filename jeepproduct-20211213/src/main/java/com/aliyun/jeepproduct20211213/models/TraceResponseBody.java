// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TraceResponseBody extends TeaModel {
    @NameInMap("Blue")
    public String blue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    @NameInMap("status")
    public String status;

    public static TraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TraceResponseBody self = new TraceResponseBody();
        return TeaModel.build(map, self);
    }

    public TraceResponseBody setBlue(String blue) {
        this.blue = blue;
        return this;
    }
    public String getBlue() {
        return this.blue;
    }

    public TraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TraceResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public TraceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
