// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosServiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteNacosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosServiceRequest self = new DeleteNacosServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DeleteNacosServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteNacosServiceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
