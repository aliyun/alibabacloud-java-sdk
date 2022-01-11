// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RequestPayDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RequestPayDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestPayDemandResponseBody self = new RequestPayDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestPayDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
