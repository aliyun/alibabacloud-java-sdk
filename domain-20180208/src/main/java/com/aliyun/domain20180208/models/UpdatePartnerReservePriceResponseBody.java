// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdatePartnerReservePriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePartnerReservePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartnerReservePriceResponseBody self = new UpdatePartnerReservePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePartnerReservePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
