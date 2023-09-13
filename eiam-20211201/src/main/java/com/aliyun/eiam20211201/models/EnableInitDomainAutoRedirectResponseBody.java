// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInitDomainAutoRedirectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInitDomainAutoRedirectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInitDomainAutoRedirectResponseBody self = new EnableInitDomainAutoRedirectResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInitDomainAutoRedirectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
