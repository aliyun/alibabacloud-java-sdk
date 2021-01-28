// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EnableDcdnDomainOfflineLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDcdnDomainOfflineLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDcdnDomainOfflineLogDeliveryResponseBody self = new EnableDcdnDomainOfflineLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDcdnDomainOfflineLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
