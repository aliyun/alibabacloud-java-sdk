// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ReactivateDomainResponseBody extends TeaModel {
    /**
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.</p>
     * <p>*   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.</p>
     * <p>*   You can call this operation to reactivate the domain name to resume normal access.</p>
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
