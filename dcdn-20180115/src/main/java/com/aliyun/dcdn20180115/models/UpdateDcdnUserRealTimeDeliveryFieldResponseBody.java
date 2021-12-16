// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnUserRealTimeDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnUserRealTimeDeliveryFieldResponseBody self = new UpdateDcdnUserRealTimeDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnUserRealTimeDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
