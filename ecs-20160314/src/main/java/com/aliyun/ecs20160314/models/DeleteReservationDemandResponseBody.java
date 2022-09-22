// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteReservationDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReservationDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReservationDemandResponseBody self = new DeleteReservationDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReservationDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
