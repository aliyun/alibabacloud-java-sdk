// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SendTokenCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendTokenCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendTokenCodeResponseBody self = new SendTokenCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SendTokenCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
