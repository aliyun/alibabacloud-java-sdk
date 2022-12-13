// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("serviceDescription")
    public String serviceDescription;

    @NameInMap("serviceId")
    public Long serviceId;

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

    public UpdateServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
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
