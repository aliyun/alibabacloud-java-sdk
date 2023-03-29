// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class StartCdnDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCdnDomainResponseBody self = new StartCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
