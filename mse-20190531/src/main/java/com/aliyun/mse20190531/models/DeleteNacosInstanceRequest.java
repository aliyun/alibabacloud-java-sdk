// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosInstanceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The alias of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Specifies whether the node is an ephemeral node. Valid values:</p>
     * <br>
     * <p>*   `true`: yes</p>
     * <p>*   `false`: no</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    /**
     * <p>The name of the group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the Nacos instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the Nacos instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The port of the Nacos instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The name of the service.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static DeleteNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosInstanceRequest self = new DeleteNacosInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosInstanceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DeleteNacosInstanceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public DeleteNacosInstanceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteNacosInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeleteNacosInstanceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeleteNacosInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteNacosInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
