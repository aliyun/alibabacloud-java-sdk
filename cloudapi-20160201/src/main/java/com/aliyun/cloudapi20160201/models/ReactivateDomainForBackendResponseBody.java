// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ReactivateDomainForBackendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReactivateDomainForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainForBackendResponseBody self = new ReactivateDomainForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
