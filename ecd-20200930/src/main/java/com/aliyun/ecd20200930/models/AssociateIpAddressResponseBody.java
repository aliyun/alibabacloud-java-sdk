// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateIpAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpAddressResponseBody self = new AssociateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
