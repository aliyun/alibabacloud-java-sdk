// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceId")
    public Integer serviceId;

    public static CreateStreamingDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingDataServiceResponseBody self = new CreateStreamingDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamingDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamingDataServiceResponseBody setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Integer getServiceId() {
        return this.serviceId;
    }

}
