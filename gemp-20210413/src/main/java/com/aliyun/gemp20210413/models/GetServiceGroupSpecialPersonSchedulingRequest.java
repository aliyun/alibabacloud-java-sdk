// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSpecialPersonSchedulingRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    public static GetServiceGroupSpecialPersonSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSpecialPersonSchedulingRequest self = new GetServiceGroupSpecialPersonSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSpecialPersonSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceGroupSpecialPersonSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetServiceGroupSpecialPersonSchedulingRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
