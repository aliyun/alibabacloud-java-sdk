// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    /**
     * <strong>example:</strong>
     * <p>服务描述</p>
     */
    @NameInMap("serviceDescription")
    public String serviceDescription;

    @NameInMap("serviceGroupIdList")
    public java.util.List<Long> serviceGroupIdList;

    /**
     * <strong>example:</strong>
     * <p>10002000</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>服务名字</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    public UpdateServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public UpdateServiceRequest setServiceGroupIdList(java.util.List<Long> serviceGroupIdList) {
        this.serviceGroupIdList = serviceGroupIdList;
        return this;
    }
    public java.util.List<Long> getServiceGroupIdList() {
        return this.serviceGroupIdList;
    }

    public UpdateServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
