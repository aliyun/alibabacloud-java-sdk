// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainStagingConfigResponseBody self = new SetLiveDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
