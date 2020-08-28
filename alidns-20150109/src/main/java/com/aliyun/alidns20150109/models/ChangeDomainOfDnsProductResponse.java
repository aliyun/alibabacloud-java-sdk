// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OriginalDomain")
    @Validation(required = true)
    public String originalDomain;

    public static ChangeDomainOfDnsProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductResponse self = new ChangeDomainOfDnsProductResponse();
        return TeaModel.build(map, self);
    }

}
