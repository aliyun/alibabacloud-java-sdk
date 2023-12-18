// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnAssociateEnsEipAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnAssociateEnsEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateEnsEipAddressResponseBody self = new UnAssociateEnsEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UnAssociateEnsEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
