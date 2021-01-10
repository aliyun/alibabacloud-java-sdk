// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainPlayMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveDomainPlayMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainPlayMappingResponseBody self = new DeleteLiveDomainPlayMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainPlayMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
