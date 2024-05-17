// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExternalDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceId")
    public Integer serviceId;

    public static CreateExternalDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalDataServiceResponseBody self = new CreateExternalDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExternalDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExternalDataServiceResponseBody setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Integer getServiceId() {
        return this.serviceId;
    }

}
