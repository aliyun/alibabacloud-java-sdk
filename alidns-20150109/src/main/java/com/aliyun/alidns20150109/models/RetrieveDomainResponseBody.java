// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RetrieveDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CC0D642-49D4-48DE-A1A5-9F218652E4A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetrieveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveDomainResponseBody self = new RetrieveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
