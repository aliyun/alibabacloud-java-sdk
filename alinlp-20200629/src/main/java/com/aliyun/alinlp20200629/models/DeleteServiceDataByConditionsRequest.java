// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByConditionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("X-DashScope-OpenAPISource")
    public String xDashScopeOpenAPISource;

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

    public DeleteServiceDataByConditionsRequest setXDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
        this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
        return this;
    }
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

}
