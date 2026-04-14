// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpAutoRenewalResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DedicatedIpAutoRenewalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpAutoRenewalResponseBody self = new DedicatedIpAutoRenewalResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpAutoRenewalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
