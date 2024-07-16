// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    /**
     * <p>The status of the domain name. Indicates whether the domain name is verified and available.</p>
     * <ul>
     * <li>0: indicates that the domain name is verified and available.</li>
     * <li>1: indicates that the domain name fails to be verified and is unavailable.</li>
     * <li>2: indicates that the domain name is available, but not filed or configured with a CNAME record.</li>
     * <li>3: indicates that the domain name is available but not filed.</li>
     * <li>4: indicates that the domain name is available but not configured with a CNAME record.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0B82E83-A1D9-4FE6-97D2-F4B231F80B02</p>
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
