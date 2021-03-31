// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrivatePoolOptionsId")
    public String privatePoolOptionsId;

    public static CreateCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationResponseBody self = new CreateCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCapacityReservationResponseBody setPrivatePoolOptionsId(String privatePoolOptionsId) {
        this.privatePoolOptionsId = privatePoolOptionsId;
        return this;
    }
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

}
