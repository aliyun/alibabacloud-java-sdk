// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssociateEipAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressResponseBody self = new AssociateEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
