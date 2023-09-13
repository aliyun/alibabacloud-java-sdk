// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    /**
     * <p>The status of the domain name. Indicates whether the domain name is verified and available.</p>
     * <br>
     * <p>*   0: indicates that the domain name is verified and available.</p>
     * <p>*   1: indicates that the domain name fails to be verified and is unavailable.</p>
     * <p>*   2: indicates that the domain name is available, but not filed or configured with a CNAME record.</p>
     * <p>*   3: indicates that the domain name is available but not filed.</p>
     * <p>*   4: indicates that the domain name is available but not configured with a CNAME record.</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponseBody self = new CheckDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponseBody setDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public Integer getDomainStatus() {
        return this.domainStatus;
    }

    public CheckDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
