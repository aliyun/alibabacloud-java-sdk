// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateDeliveryHistoryJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDeliveryHistoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryHistoryJobResponse self = new CreateDeliveryHistoryJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryHistoryJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
