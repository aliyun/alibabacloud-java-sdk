// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UnassociateAnycastEipAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateAnycastEipAddressResponseBody self = new UnassociateAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
