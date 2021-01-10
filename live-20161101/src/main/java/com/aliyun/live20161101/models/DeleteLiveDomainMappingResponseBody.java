// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveDomainMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainMappingResponseBody self = new DeleteLiveDomainMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
