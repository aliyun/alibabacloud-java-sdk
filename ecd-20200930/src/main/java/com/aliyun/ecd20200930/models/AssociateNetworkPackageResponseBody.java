// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateNetworkPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateNetworkPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkPackageResponseBody self = new AssociateNetworkPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
