// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupRequest extends TeaModel {
    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupRequest self = new DeleteServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public DeleteServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
