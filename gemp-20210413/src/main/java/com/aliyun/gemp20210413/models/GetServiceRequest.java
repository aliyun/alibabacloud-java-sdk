// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 服务ID
    @NameInMap("serviceId")
    public Long serviceId;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
