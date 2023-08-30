// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StartDcdnDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDcdnDomainResponseBody self = new StartDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
