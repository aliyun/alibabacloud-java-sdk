// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("ServiceCount")
    public Integer serviceCount;

    @NameInMap("Id")
    public String id;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateEngineNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceRequest self = new UpdateEngineNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEngineNamespaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateEngineNamespaceRequest setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    public UpdateEngineNamespaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateEngineNamespaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateEngineNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
