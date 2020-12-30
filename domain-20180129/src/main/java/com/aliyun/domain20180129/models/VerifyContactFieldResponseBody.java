// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyContactFieldResponseBody extends TeaModel {
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
