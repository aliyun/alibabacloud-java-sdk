// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableInitDomainAutoRedirectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableInitDomainAutoRedirectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableInitDomainAutoRedirectResponseBody self = new DisableInitDomainAutoRedirectResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableInitDomainAutoRedirectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
