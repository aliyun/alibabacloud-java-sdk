// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AttachRabbitmqPublisherResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static AttachRabbitmqPublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachRabbitmqPublisherResponseBody self = new AttachRabbitmqPublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachRabbitmqPublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
