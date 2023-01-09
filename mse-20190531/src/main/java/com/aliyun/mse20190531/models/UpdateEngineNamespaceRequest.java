// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The description of the cluster.
    @NameInMap("Desc")
    public String desc;

    // The ID of the namespace.
    @NameInMap("Id")
    public String id;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The name of the cluster.
    @NameInMap("Name")
    public String name;

    // The number of active services.
    @NameInMap("ServiceCount")
    public Integer serviceCount;

    public static UpdateEngineNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceRequest self = new UpdateEngineNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateEngineNamespaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateEngineNamespaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateEngineNamespaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateEngineNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEngineNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEngineNamespaceRequest setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
    }

}
