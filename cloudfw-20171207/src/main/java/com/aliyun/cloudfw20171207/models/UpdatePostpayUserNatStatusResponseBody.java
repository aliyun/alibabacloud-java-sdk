// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserNatStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePostpayUserNatStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserNatStatusResponseBody self = new UpdatePostpayUserNatStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserNatStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
