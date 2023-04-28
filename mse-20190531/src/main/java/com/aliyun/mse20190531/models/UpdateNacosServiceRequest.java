// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosServiceRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>systemError</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("ProtectThreshold")
    public String protectThreshold;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static UpdateNacosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosServiceRequest self = new UpdateNacosServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateNacosServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateNacosServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateNacosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosServiceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosServiceRequest setProtectThreshold(String protectThreshold) {
        this.protectThreshold = protectThreshold;
        return this;
    }
    public String getProtectThreshold() {
        return this.protectThreshold;
    }

    public UpdateNacosServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
