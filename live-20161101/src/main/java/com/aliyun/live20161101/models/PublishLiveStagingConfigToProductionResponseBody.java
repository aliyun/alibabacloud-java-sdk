// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PublishLiveStagingConfigToProductionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishLiveStagingConfigToProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveStagingConfigToProductionResponseBody self = new PublishLiveStagingConfigToProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishLiveStagingConfigToProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
