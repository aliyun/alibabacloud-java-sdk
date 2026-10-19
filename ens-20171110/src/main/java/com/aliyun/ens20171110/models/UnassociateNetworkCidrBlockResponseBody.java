// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateNetworkCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkCidrBlockResponseBody self = new UnassociateNetworkCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
