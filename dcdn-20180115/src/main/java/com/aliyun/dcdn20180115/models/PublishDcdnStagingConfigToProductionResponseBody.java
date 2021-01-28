// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishDcdnStagingConfigToProductionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishDcdnStagingConfigToProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishDcdnStagingConfigToProductionResponseBody self = new PublishDcdnStagingConfigToProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishDcdnStagingConfigToProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
