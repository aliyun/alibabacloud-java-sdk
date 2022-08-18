// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponseBody extends TeaModel {
    @NameInMap("OriginalDomain")
    public String originalDomain;

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
