// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByConditionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Conditions")
    public String conditionsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("X-DashScope-OpenAPISource")
    public String xDashScopeOpenAPISource;

    public static DeleteServiceDataByConditionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByConditionsShrinkRequest self = new DeleteServiceDataByConditionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByConditionsShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public DeleteServiceDataByConditionsShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeleteServiceDataByConditionsShrinkRequest setXDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
        this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
        return this;
    }
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

}
