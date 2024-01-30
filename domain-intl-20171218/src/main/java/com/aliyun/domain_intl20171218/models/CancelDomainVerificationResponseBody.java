// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelDomainVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationResponseBody self = new CancelDomainVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
