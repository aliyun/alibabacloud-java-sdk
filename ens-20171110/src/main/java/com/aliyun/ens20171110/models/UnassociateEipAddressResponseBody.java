// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressResponseBody self = new UnassociateEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
