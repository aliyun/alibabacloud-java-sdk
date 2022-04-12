// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ServicePorts")
    public java.util.Map<String, ?> servicePorts;

    @NameInMap("Type")
    public String type;

    public static CreateK8sServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sServiceRequest self = new CreateK8sServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateK8sServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateK8sServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateK8sServiceRequest setServicePorts(java.util.Map<String, ?> servicePorts) {
        this.servicePorts = servicePorts;
        return this;
    }
    public java.util.Map<String, ?> getServicePorts() {
        return this.servicePorts;
    }

    public CreateK8sServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
