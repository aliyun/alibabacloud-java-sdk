// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AttachRabbitmqPublisherResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D1DEAA38-D888-5811-A8A6-E1E2FBC0779C</p>
     */
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
