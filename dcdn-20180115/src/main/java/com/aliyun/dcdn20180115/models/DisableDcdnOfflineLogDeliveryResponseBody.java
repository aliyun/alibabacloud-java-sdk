// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnOfflineLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDcdnOfflineLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnOfflineLogDeliveryResponseBody self = new DisableDcdnOfflineLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDcdnOfflineLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
