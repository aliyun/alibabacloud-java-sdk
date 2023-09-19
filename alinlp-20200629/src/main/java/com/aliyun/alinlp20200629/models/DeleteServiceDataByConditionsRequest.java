// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByConditionsRequest extends TeaModel {
    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteServiceDataByConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByConditionsRequest self = new DeleteServiceDataByConditionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByConditionsRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public DeleteServiceDataByConditionsRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
