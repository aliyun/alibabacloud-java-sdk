// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnDomainOfflineLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDcdnDomainOfflineLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnDomainOfflineLogDeliveryResponseBody self = new DisableDcdnDomainOfflineLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDcdnDomainOfflineLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
