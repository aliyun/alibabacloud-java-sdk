// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AssociateInstanceWithPrivateDNSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>03442A3D-3B7D-434C-8A95-A5FEB999B529</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateInstanceWithPrivateDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateInstanceWithPrivateDNSResponseBody self = new AssociateInstanceWithPrivateDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateInstanceWithPrivateDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
