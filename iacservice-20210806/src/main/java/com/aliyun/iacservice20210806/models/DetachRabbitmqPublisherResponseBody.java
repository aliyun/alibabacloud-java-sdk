// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DetachRabbitmqPublisherResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DetachRabbitmqPublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachRabbitmqPublisherResponseBody self = new DetachRabbitmqPublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachRabbitmqPublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
