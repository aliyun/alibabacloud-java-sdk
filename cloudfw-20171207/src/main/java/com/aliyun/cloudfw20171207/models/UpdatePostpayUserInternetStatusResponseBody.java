// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserInternetStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-000901******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePostpayUserInternetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserInternetStatusResponseBody self = new UpdatePostpayUserInternetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserInternetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
