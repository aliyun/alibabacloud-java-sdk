// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CheckSmsSignNewResponseBody extends TeaModel {
    @NameInMap("Common")
    public Boolean common;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Verification")
    public Boolean verification;

    public static CheckSmsSignNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsSignNewResponseBody self = new CheckSmsSignNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSmsSignNewResponseBody setCommon(Boolean common) {
        this.common = common;
        return this;
    }
    public Boolean getCommon() {
        return this.common;
    }

    public CheckSmsSignNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSmsSignNewResponseBody setVerification(Boolean verification) {
        this.verification = verification;
        return this;
    }
    public Boolean getVerification() {
        return this.verification;
    }

}
