// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static GetServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupRequest self = new GetServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceGroupRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
