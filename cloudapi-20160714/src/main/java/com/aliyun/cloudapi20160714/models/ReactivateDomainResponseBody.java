// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ReactivateDomainResponseBody extends TeaModel {
    /**
     * <p>Reactivates a custom domain name whose validity status is Abnormal.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReactivateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainResponseBody self = new ReactivateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
