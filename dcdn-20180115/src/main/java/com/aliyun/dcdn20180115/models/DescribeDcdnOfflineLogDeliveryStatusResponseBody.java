// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryStatusResponseBody extends TeaModel {
    @NameInMap("OpenStatus")
    public String openStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnOfflineLogDeliveryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryStatusResponseBody self = new DescribeDcdnOfflineLogDeliveryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryStatusResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

    public DescribeDcdnOfflineLogDeliveryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
