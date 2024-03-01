// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDnsCacheDomainRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRemarkResponseBody self = new UpdateDnsCacheDomainRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
