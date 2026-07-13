// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponseBody extends TeaModel {
    /**
     * <p>The domain name that was originally attached. If this parameter is empty, it indicates that this is the first time a domain name is attached to the product.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
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
