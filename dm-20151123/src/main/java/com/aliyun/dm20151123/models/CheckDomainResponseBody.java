// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    /**
     * <p>Domain status. Indicates whether the verification was successful, with values as follows:</p>
     * <ul>
     * <li><strong>0</strong>: Available, verified successfully</li>
     * <li><strong>1</strong>: Unavailable, verification failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <p>Request ID</p>
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
