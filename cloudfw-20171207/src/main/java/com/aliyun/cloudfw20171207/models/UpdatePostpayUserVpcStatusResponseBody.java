// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserVpcStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>450D47F5-956E-543E-8502-2F71C8******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePostpayUserVpcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserVpcStatusResponseBody self = new UpdatePostpayUserVpcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserVpcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
