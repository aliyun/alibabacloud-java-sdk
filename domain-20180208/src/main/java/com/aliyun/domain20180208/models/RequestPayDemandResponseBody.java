// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RequestPayDemandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>497F7522-82B0-4BD4-84FE-AE8749E4C2F9</p>
     */
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
