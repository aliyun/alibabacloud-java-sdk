// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>服务名称</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    public CreateServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public CreateServiceRequest setServiceGroupIdList(java.util.List<Long> serviceGroupIdList) {
        this.serviceGroupIdList = serviceGroupIdList;
        return this;
    }
    public java.util.List<Long> getServiceGroupIdList() {
        return this.serviceGroupIdList;
    }

    public CreateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
