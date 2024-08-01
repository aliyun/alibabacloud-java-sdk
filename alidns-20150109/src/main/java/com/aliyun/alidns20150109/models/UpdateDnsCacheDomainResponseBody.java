// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDnsCacheDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainResponseBody self = new UpdateDnsCacheDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
