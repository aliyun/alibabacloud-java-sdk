// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRemarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDnsCacheDomainRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRemarkResponse self = new UpdateDnsCacheDomainRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRemarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
