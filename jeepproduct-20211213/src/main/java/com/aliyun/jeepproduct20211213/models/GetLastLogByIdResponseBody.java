// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class GetLastLogByIdResponseBody extends TeaModel {
    @NameInMap("Blue")
    public String blue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    @NameInMap("status")
    public String status;

    public static GetLastLogByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLastLogByIdResponseBody self = new GetLastLogByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLastLogByIdResponseBody setBlue(String blue) {
        this.blue = blue;
        return this;
    }
    public String getBlue() {
        return this.blue;
    }

    public GetLastLogByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLastLogByIdResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public GetLastLogByIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
