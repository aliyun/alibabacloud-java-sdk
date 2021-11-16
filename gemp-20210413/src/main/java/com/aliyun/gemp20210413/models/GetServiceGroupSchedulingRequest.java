// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static GetServiceGroupSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingRequest self = new GetServiceGroupSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceGroupSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
