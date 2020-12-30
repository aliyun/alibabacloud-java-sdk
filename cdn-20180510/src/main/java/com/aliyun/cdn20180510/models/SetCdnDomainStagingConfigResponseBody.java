// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigResponseBody self = new SetCdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
