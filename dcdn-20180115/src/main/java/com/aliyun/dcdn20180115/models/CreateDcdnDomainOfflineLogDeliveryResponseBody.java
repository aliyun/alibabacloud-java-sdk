// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDomainOfflineLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnDomainOfflineLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDomainOfflineLogDeliveryResponseBody self = new CreateDcdnDomainOfflineLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDomainOfflineLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
