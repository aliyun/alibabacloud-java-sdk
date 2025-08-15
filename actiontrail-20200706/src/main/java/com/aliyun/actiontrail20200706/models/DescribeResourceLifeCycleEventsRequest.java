// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeResourceLifeCycleEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeResourceLifeCycleEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLifeCycleEventsRequest self = new DescribeResourceLifeCycleEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLifeCycleEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceLifeCycleEventsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
