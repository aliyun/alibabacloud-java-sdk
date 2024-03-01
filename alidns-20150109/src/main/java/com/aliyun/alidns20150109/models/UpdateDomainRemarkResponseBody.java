// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDomainRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRemarkResponseBody self = new UpdateDomainRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
