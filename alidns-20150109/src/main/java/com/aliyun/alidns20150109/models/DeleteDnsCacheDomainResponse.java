// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsCacheDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsCacheDomainResponse self = new DeleteDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsCacheDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
