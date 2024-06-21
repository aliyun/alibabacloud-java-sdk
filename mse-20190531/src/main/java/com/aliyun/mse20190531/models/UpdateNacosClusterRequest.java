// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The port used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CheckPort")
    public Integer checkPort;

    /**
     * <p>The name of the Nacos cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The name of the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;none&quot;}</p>
     */
    @NameInMap("HealthChecker")
    public String healthChecker;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-123456</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>9e78a671-4b9b-4dd4-99c1-0b9da87d3dec</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_service</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>Specifies whether to use the port of the instance for a health check.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseInstancePortForCheck")
    public Boolean useInstancePortForCheck;

    public static UpdateNacosClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterRequest self = new UpdateNacosClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateNacosClusterRequest setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
        return this;
    }
    public Integer getCheckPort() {
        return this.checkPort;
    }

    public UpdateNacosClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateNacosClusterRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateNacosClusterRequest setHealthChecker(String healthChecker) {
        this.healthChecker = healthChecker;
        return this;
    }
    public String getHealthChecker() {
        return this.healthChecker;
    }

    public UpdateNacosClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosClusterRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosClusterRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateNacosClusterRequest setUseInstancePortForCheck(Boolean useInstancePortForCheck) {
        this.useInstancePortForCheck = useInstancePortForCheck;
        return this;
    }
    public Boolean getUseInstancePortForCheck() {
        return this.useInstancePortForCheck;
    }

}
