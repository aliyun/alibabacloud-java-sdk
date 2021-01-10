// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartLiveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLiveDomainResponseBody self = new StartLiveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLiveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
