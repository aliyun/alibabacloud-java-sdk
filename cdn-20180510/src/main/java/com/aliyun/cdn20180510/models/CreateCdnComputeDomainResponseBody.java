// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnComputeDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdnComputeDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnComputeDomainResponseBody self = new CreateCdnComputeDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdnComputeDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
