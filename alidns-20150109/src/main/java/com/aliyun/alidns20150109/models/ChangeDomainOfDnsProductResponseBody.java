// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OriginalDomain")
    public String originalDomain;

    public static ChangeDomainOfDnsProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductResponseBody self = new ChangeDomainOfDnsProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeDomainOfDnsProductResponseBody setOriginalDomain(String originalDomain) {
        this.originalDomain = originalDomain;
        return this;
    }
    public String getOriginalDomain() {
        return this.originalDomain;
    }

}
