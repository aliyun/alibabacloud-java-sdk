// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DissociateInstanceWithPrivateDNSResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateInstanceWithPrivateDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateInstanceWithPrivateDNSResponseBody self = new DissociateInstanceWithPrivateDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateInstanceWithPrivateDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
