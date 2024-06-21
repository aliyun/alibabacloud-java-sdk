// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosInstanceRequest extends TeaModel {
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
     * <p>The alias of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Specifies whether the node is an ephemeral node. Valid values:</p>
     * <ul>
     * <li><code>true</code>: yes</li>
     * <li><code>false</code>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

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
     * <p>The ID of the Nacos instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21v5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the Nacos instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.237.1.32</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>9e78a671-4b9b-4dd4-99c1-0b9da87****</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The port of the Nacos instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_service</p>
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
