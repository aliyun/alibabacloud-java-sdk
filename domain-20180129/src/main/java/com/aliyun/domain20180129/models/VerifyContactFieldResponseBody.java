// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyContactFieldResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABAC3BAC-FCFA-4DAE-B47C-FA4105CB07C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyContactFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyContactFieldResponseBody self = new VerifyContactFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyContactFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
