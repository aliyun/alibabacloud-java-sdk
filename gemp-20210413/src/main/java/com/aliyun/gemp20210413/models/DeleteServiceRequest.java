// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceRequest extends TeaModel {
    // 服务ID
    @NameInMap("serviceId")
    public Long serviceId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRequest self = new DeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeleteServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
