// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetupDomainAutoRenewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static SetupDomainAutoRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupDomainAutoRenewResponseBody self = new SetupDomainAutoRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupDomainAutoRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupDomainAutoRenewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
