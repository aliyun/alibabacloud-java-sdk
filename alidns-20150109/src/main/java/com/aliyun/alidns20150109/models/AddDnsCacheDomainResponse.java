// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsCacheDomainResponse self = new AddDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsCacheDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
