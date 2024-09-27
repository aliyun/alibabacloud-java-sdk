// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponseBody extends TeaModel {
    /**
     * <p>The domain name that is originally bound to the instance. If no value is returned for this parameter, the instance is bound to a domain name for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>originaldomain.com</p>
     */
    @NameInMap("OriginalDomain")
    public String originalDomain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeDomainOfDnsProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductResponseBody self = new ChangeDomainOfDnsProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductResponseBody setOriginalDomain(String originalDomain) {
        this.originalDomain = originalDomain;
        return this;
    }
    public String getOriginalDomain() {
        return this.originalDomain;
    }

    public ChangeDomainOfDnsProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
