// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateEnsEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateEnsEipAddressResponseBody self = new AssociateEnsEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateEnsEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
