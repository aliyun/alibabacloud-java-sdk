// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateServiceDataRequest extends TeaModel {
    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static UpdateServiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceDataRequest self = new UpdateServiceDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceDataRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public UpdateServiceDataRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
