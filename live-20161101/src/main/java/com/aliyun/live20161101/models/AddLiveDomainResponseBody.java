// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainResponseBody self = new AddLiveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
