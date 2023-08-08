// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ModifyServiceInstanceResourcesRequest extends TeaModel {
    @NameInMap("Resources")
    public String resources;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceInstanceResourcesAction")
    public String serviceInstanceResourcesAction;

    public static ModifyServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInstanceResourcesRequest self = new ModifyServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInstanceResourcesRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ModifyServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public ModifyServiceInstanceResourcesRequest setServiceInstanceResourcesAction(String serviceInstanceResourcesAction) {
        this.serviceInstanceResourcesAction = serviceInstanceResourcesAction;
        return this;
    }
    public String getServiceInstanceResourcesAction() {
        return this.serviceInstanceResourcesAction;
    }

}
