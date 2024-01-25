// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateAnycastEipAddressResponseBody self = new AssociateAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
