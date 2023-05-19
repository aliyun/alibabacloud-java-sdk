// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StopDcdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDcdnDomainResponseBody self = new StopDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
