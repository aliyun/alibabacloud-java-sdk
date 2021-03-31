// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PrivatePoolOptionsId")
    @Validation(required = true)
    public String privatePoolOptionsId;

    public static CreateCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationResponse self = new CreateCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCapacityReservationResponse setPrivatePoolOptionsId(String privatePoolOptionsId) {
        this.privatePoolOptionsId = privatePoolOptionsId;
        return this;
    }
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

}
