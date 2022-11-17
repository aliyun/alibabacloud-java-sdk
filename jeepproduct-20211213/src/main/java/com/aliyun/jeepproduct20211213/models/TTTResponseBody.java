// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TTTResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TTTResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TTTResponseBody self = new TTTResponseBody();
        return TeaModel.build(map, self);
    }

    public TTTResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
