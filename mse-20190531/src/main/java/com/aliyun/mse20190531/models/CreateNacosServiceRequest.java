// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosServiceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster. This operation contains both the InstanceId and ClusterId parameters. You must configure either InstanceId or ClusterId.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether the instance is a temporary node. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    // The name of the group.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the instance.
    // 
    // > This operation contains both the InstanceId and ClusterId parameters. You must configure either InstanceId or ClusterId.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The protection threshold.
    @NameInMap("ProtectThreshold")
    public String protectThreshold;

    // The name of the service.
    @NameInMap("ServiceName")
    public String serviceName;

    public static CreateNacosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosServiceRequest self = new CreateNacosServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNacosServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNacosServiceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public CreateNacosServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateNacosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosServiceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosServiceRequest setProtectThreshold(String protectThreshold) {
        this.protectThreshold = protectThreshold;
        return this;
    }
    public String getProtectThreshold() {
        return this.protectThreshold;
    }

    public CreateNacosServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
