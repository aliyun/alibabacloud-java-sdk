// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRabbitmqPublisherAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2D0E863-1651-5E58-823F-B451C8C24615</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRabbitmqPublisherAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRabbitmqPublisherAttributeResponseBody self = new UpdateRabbitmqPublisherAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRabbitmqPublisherAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
