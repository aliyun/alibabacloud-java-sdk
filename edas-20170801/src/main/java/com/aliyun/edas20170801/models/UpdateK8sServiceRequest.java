// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ExternalTrafficPolicy")
    public String externalTrafficPolicy;

    @NameInMap("Name")
    public String name;

    @NameInMap("ServicePorts")
    public java.util.Map<String, ?> servicePorts;

    @NameInMap("Type")
    public String type;

    public static UpdateK8sServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sServiceRequest self = new UpdateK8sServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sServiceRequest setExternalTrafficPolicy(String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
        return this;
    }
    public String getExternalTrafficPolicy() {
        return this.externalTrafficPolicy;
    }

    public UpdateK8sServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateK8sServiceRequest setServicePorts(java.util.Map<String, ?> servicePorts) {
        this.servicePorts = servicePorts;
        return this;
    }
    public java.util.Map<String, ?> getServicePorts() {
        return this.servicePorts;
    }

    public UpdateK8sServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
