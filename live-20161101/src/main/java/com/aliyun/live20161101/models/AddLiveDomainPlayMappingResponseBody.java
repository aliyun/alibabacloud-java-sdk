// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainPlayMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveDomainPlayMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainPlayMappingResponseBody self = new AddLiveDomainPlayMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainPlayMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
