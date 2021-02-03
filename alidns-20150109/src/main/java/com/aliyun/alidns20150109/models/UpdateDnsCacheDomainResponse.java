// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainResponse self = new UpdateDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
